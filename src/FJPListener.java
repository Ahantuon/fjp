package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FJPListener extends FJPParserBaseListener{
    private static final int STACK_SIZE = 3;
    private static final int VARIABLE_INSTRUCTION_COUNT = 2;
    private static final int DEFAULT_VALUE = 0;
    private static final int TRUE_VALUE = 1;
    private static final String TRUE_TEXT = "true";
    private static final String FALSE_TEXT = "false";

    private Map<String, Integer> constants;
    private Map<String, Integer> variables;
    private Map<String, Integer> localVariables;
    private Map<String, Procedure> procedures;


    private int base;
    private int top;
    private int level;
    private List<String> instructions;
    private int procedureEnter = 0;
    private int cycleJump = 0;
    private int globalsEndAddress = 0;
    private int mainAddress = 0;
    private int ifJump = 0;
    private int elseJump = 0;

    private FJPListener() {
        base = 1;
        top = 0;
        level = 0;
        constants = new HashMap<>();
        variables = new HashMap<>();
        localVariables = new HashMap<>();
        procedures = new HashMap<>();
        instructions = new ArrayList<>();
    }

    @Override
    public void enterProgram(FJPParser.ProgramContext ctx){
        instructions.add(PL0InstructionsFactory.getJmp(base));
    }

    @Override
    public void exitProgram(FJPParser.ProgramContext ctx){
        printInstructions();
    }

    @Override
    public void exitGlobals(FJPParser.GlobalsContext ctx){
        int variablesCount = ctx.getChildCount();
        int totalSize = STACK_SIZE + variablesCount;
        instructions.add(instructions.size() - (VARIABLE_INSTRUCTION_COUNT * variablesCount), PL0InstructionsFactory.getInt(totalSize));
        top = totalSize;
        globalsEndAddress = instructions.size();
        instructions.add(PL0InstructionsFactory.getJmp(0));
    }

    @Override
    public void exitConstant(FJPParser.ConstantContext ctx) {
        constants.put(ctx.ID().getText(), Integer.parseInt(ctx.INT_VALUE().getText()));
    }

    @Override
    public void enterProcedure(FJPParser.ProcedureContext ctx) {
        procedureEnter = instructions.size();
    }

    @Override
    public void exitProcedure(FJPParser.ProcedureContext ctx) {
        procedures.put(ctx.ID().getText(), new Procedure(procedureEnter, STACK_SIZE + ctx.body().locales().variable().size()));

    }

    @Override
    public void exitArgument(FJPParser.ArgumentContext ctx) {
        //TODO
    }

    @Override
    public void exitLocales(FJPParser.LocalesContext ctx){
        int variablesCount = localVariables.size();
        int totalSize = STACK_SIZE + variablesCount;
        instructions.add(instructions.size() - (VARIABLE_INSTRUCTION_COUNT * variablesCount), PL0InstructionsFactory.getInt(totalSize));
        top = totalSize;
    }

    @Override
    public void exitVariable(FJPParser.VariableContext ctx) {
        int address;
        String name;
        if(ctx.getParent().getRuleIndex() == FJPParser.RULE_globals){
            address = STACK_SIZE + variables.size();
            name = parseVariableContext(ctx, address);
            if(variables.containsKey(name) || constants.containsKey(name)){
                System.out.println("Tento identifikator jiz existuje: " + name + " : " + ctx.getStart());
                System.exit(1);
            }
            variables.put(name, address);
        }else{ // locale variable
            address = STACK_SIZE + localVariables.size();
            name = parseVariableContext(ctx, address);
            if(localVariables.containsKey(name) || constants.containsKey(name)){
                System.out.println("Tento identifikator jiz existuje: " + name + " : " + ctx.getStart());
                System.exit(1);
            }
            localVariables.put(name, address);
        }
    }

    @Override
    public void enterBody(FJPParser.BodyContext ctx) {
        localVariables.clear();
        level = 1;
    }

    @Override
    public void exitBody(FJPParser.BodyContext ctx) {
        instructions.add(PL0InstructionsFactory.getRet());
        level = 0;
    }

    @Override
    public void exitIds(FJPParser.IdsContext ctx) {
        int value;
        String id = ctx.ID().getText();
        if(localVariables.containsKey(id)){
            value = localVariables.get(id);
            instructions.add(PL0InstructionsFactory.getLod(0, value));
        }else if(constants.containsKey(id)){
            value = constants.get(id);
            instructions.add(PL0InstructionsFactory.getLit(value));
        }else if(variables.containsKey(id)){
            value = variables.get(id);
            instructions.add(PL0InstructionsFactory.getLod(level, value + base));
        }else{
            System.out.println("Neexitujici identifikator: " + id + " : " + ctx.getStart());
            System.exit(1);
        }

    }

    @Override
    public void exitValue(FJPParser.ValueContext ctx) {
        TerminalNode terminalNode = (TerminalNode) ctx.getChild(0);
        String text = ctx.getParent().getText();
        int value;
        if(text.equals(TRUE_TEXT) || text.equals(FALSE_TEXT)){
            value = parseBooleanValue(terminalNode);
        }else{
            value = parseIntValue(terminalNode);
        }
        instructions.add(PL0InstructionsFactory.getLit(value));
    }

    @Override
    public void exitTerm(FJPParser.TermContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof TerminalNode){
                switch (((TerminalNode)ctx.getChild(i)).getSymbol().getType()){
                    case FJPLexer.AND:
                        instructions.add(PL0InstructionsFactory.getOpr(2));
                        instructions.add(PL0InstructionsFactory.getLit(2));
                        instructions.add(PL0InstructionsFactory.getOpr(8));
                        top--;
                        break;
                    case FJPLexer.MUL:
                        instructions.add(PL0InstructionsFactory.getOpr(4));
                        top--;
                        break;
                    case FJPLexer.DIV:
                        instructions.add(PL0InstructionsFactory.getOpr(5));
                        top--;
                        break;
                }
            }
        }
    }

    @Override
    public void exitSimpleExp(FJPParser.SimpleExpContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof TerminalNode){
                switch (((TerminalNode)ctx.getChild(i)).getSymbol().getType()){
                    case FJPLexer.ADD:
                        instructions.add(PL0InstructionsFactory.getOpr(2));
                        top--;
                        break;
                    case FJPLexer.SUB:
                        instructions.add(PL0InstructionsFactory.getOpr(3));
                        top--;
                        break;
                    case FJPLexer.OR:
                        instructions.add(PL0InstructionsFactory.getOpr(2));
                        instructions.add(PL0InstructionsFactory.getLit(1));
                        instructions.add(PL0InstructionsFactory.getOpr(11));
                        top--;
                        break;
                }
            }
        }
    }

    @Override
    public void exitExpression(FJPParser.ExpressionContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof TerminalNode){
                switch (((TerminalNode)ctx.getChild(i)).getSymbol().getType()){
                    case FJPLexer.EQUAL:
                        instructions.add(PL0InstructionsFactory.getOpr(8));
                        top--;
                        break;
                    case FJPLexer.NOT_EQUAL:
                        instructions.add(PL0InstructionsFactory.getOpr(9));
                        top--;
                        break;
                    case FJPLexer.LT:
                        instructions.add(PL0InstructionsFactory.getOpr(10));
                        top--;
                        break;
                    case FJPLexer.LE:
                        instructions.add(PL0InstructionsFactory.getOpr(13));
                        top--;
                        break;
                    case FJPLexer.GE:
                        instructions.add(PL0InstructionsFactory.getOpr(11));
                        top--;
                        break;
                    case FJPLexer.GT:
                        instructions.add(PL0InstructionsFactory.getOpr(12));
                        top--;
                        break;
                }
            }
        }
        if(ctx.getParent() instanceof FJPParser.If_elseContext){
            instructions.add(PL0InstructionsFactory.getLit(1));
            instructions.add(PL0InstructionsFactory.getOpr(11));
            elseJump = instructions.size();
            instructions.add(PL0InstructionsFactory.getJmc(0));
        }
    }

    @Override
    public void exitElse_part(FJPParser.Else_partContext ctx) {
        ifJump = instructions.size();
        instructions.add(PL0InstructionsFactory.getJmp(0));
        instructions.set(elseJump, PL0InstructionsFactory.getJmc(instructions.size()));
    }

    @Override
    public void exitIf_else(FJPParser.If_elseContext ctx) {
        instructions.set(ifJump, PL0InstructionsFactory.getJmp(instructions.size()));
    }

    @Override
    public void exitAssigment(FJPParser.AssigmentContext ctx) {
        String id = ctx.ID().getText();
        if(localVariables.containsKey(id)){
            instructions.add(PL0InstructionsFactory.getSto(0, localVariables.get(id)));
        }else if(variables.containsKey(id)){
            instructions.add(PL0InstructionsFactory.getSto(level, variables.get(id) + base)); //global variable
        }else{
            System.out.println("Neexitujici identifikator: " + id + " : " + ctx.getStart());
            System.exit(1);
        }
        top--;
    }

    @Override
    public void enterDo_while(FJPParser.Do_whileContext ctx) {
        cycleJump = instructions.size();
    }

    @Override
    public void exitDo_while(FJPParser.Do_whileContext ctx) {
        instructions.add(PL0InstructionsFactory.getLit(1));
        instructions.add(PL0InstructionsFactory.getOpr(10));
        instructions.add(PL0InstructionsFactory.getJmc(cycleJump));
    }

    @Override
    public void exitCall(FJPParser.CallContext ctx) {
        String id = ctx.ID().getText();
        if(procedures.containsKey(id)){
            Procedure procedure = procedures.get(id);
            instructions.add(PL0InstructionsFactory.getCal(level, procedure.getAddress()));
        }else{
            System.out.println("Neexitujici procedura: " + id + " : " + ctx.getStart());
            System.exit(1);
        }
    }

    @Override
    public void enterMain(FJPParser.MainContext ctx) {
        mainAddress = instructions.size();
    }

    @Override
    public void exitMain(FJPParser.MainContext ctx) {
        instructions.set(globalsEndAddress, PL0InstructionsFactory.getJmp(mainAddress));
    }

    private void printInstructions(){
        for (int i = 0; i < instructions.size(); i++) {
            System.out.println(i + "\t" + instructions.get(i));
        }
    }

    private String parseVariableContext(FJPParser.VariableContext ctx, int address) {
        int value;
        String name;
        if(ctx.int_var() != null){
            name = ctx.int_var().ID().getText();
            value = parseIntValue(ctx.int_var().INT_VALUE());
        }else{
            name = ctx.boolean_var().ID().getText();
            value = parseBooleanValue(ctx.boolean_var().BOOLEAN_VALUE());
        }
        addVariable(address, value);
        return name;
    }

    private int parseIntValue(TerminalNode terminalNode) {
        int value = DEFAULT_VALUE;
        if(terminalNode != null){
            value = Integer.parseInt(terminalNode.getText());
        }
        return value;
    }

    private int parseBooleanValue(TerminalNode terminalNode) {
        int value = DEFAULT_VALUE;
        if(terminalNode != null && terminalNode.getText().equals(TRUE_TEXT)){
            value = TRUE_VALUE;
        }
        return value;
    }

    private void addVariable(int address, int value) {
        instructions.add(PL0InstructionsFactory.getLit(value));
        instructions.add(PL0InstructionsFactory.getSto(0, address));
    }

    public static void main(String[] args) {
        try {
            InputStream stream = new FileInputStream(args[0]);
            FJPLexer lexer = new FJPLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
            FJPParser parser = new FJPParser(new CommonTokenStream(lexer));
            parser.addParseListener(new FJPListener());

            // Start parsing
            parser.program();
        } catch (IOException e) {
            System.out.println("Chybny vstupni soubor: " + e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Nastala chyba pri prekladu: " + e.getMessage());
        }
    }
}
