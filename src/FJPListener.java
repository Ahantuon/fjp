package src;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import src.parser.FJPLexer;
import src.parser.FJPParser;
import src.parser.FJPParserBaseListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Listener for generating PL0 instruction for FJP grammar
 */
public class FJPListener extends FJPParserBaseListener {
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
    private int level;
    private List<String> instructions;
    private int procedureEnter = 0;
    private int procedureReturn = -1;
    private List<Integer> arguments;
    private int cycleJump = 0;
    private int cycleEndJump = 0;
    private int globalsEndAddress = 0;
    private int mainAddress = 0;
    private int ifJump = 0;
    private int elseJump = 0;

    FJPListener() {
        base = 1;
        level = 0;
        constants = new HashMap<>();
        variables = new HashMap<>();
        localVariables = new HashMap<>();
        procedures = new HashMap<>();
        instructions = new ArrayList<>();
        arguments = new ArrayList<>();
    }

    /**
     * Jump on first instruction
     */
    @Override
    public void enterProgram(FJPParser.ProgramContext ctx){
        instructions.add(PL0InstructionsFactory.getJmp(base));
    }

    /**
     * Print all instruction to output
     */
    @Override
    public void exitProgram(FJPParser.ProgramContext ctx){
        printInstructions();
    }

    /**
     * Make space for globals variables and create jump on main which is set later
     */
    @Override
    public void exitGlobals(FJPParser.GlobalsContext ctx){
        int variablesCount = ctx.getChildCount();
        int totalSize = STACK_SIZE + variablesCount;
        instructions.add(instructions.size() - (VARIABLE_INSTRUCTION_COUNT * variablesCount), PL0InstructionsFactory.getInt(totalSize));
        globalsEndAddress = instructions.size();
        instructions.add(PL0InstructionsFactory.getJmp(0));
    }

    /**
     * Add constant values
     */
    @Override
    public void exitConstant(FJPParser.ConstantContext ctx) {
        constants.put(ctx.ID().getText(), Integer.parseInt(ctx.INT_VALUE().getText()));
    }

    /**
     * Prepare start procedure
     */
    @Override
    public void enterProcedure(FJPParser.ProcedureContext ctx) {
        procedureReturn = -1;
        procedureEnter = instructions.size();
        localVariables.clear();
    }

    /**
     * Prepare return value and instruction for save it which is set later
     */
    @Override
    public void exitReturn_val(FJPParser.Return_valContext ctx) {
        if(ctx.ID() != null && localVariables.containsKey(ctx.ID().getText())){
            int value = localVariables.get(ctx.ID().getText());
            instructions.add(PL0InstructionsFactory.getLod(0, value));
            procedureReturn = instructions.size();
            instructions.add(PL0InstructionsFactory.getSto(0, -1));
        }
    }

    /**
     * Create Procedure for late use, clear arguments
     */
    @Override
    public void exitProcedure(FJPParser.ProcedureContext ctx) {
        instructions.add(PL0InstructionsFactory.getRet());
        Procedure procedure = new Procedure(procedureEnter, STACK_SIZE + ctx.body().locales().variable().size(), arguments);
        if(procedureReturn != -1){
            procedure.setReturnAddress(procedureReturn);
        }
        procedures.put(ctx.ID().getText(), procedure);
        arguments.clear();
    }

    /**
     * Prepare procedure arguments as local variables
     */
    @Override
    public void exitArguments(FJPParser.ArgumentsContext ctx) {
        int argumentsCount = 0;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof FJPParser.ArgumentContext){
                localVariables.put(ctx.getChild(i).getChild(1).getText(), STACK_SIZE + argumentsCount);
                argumentsCount++;
            }
        }
        instructions.add(PL0InstructionsFactory.getInt(STACK_SIZE + argumentsCount));
        for (int i = 0; i < argumentsCount; i++) {
            arguments.add(instructions.size());
            instructions.add(PL0InstructionsFactory.getLit(-1));
            instructions.add(PL0InstructionsFactory.getSto(level,STACK_SIZE + i));
        }
    }

    /**
     * Prepare space for local variables
     */
    @Override
    public void exitLocales(FJPParser.LocalesContext ctx){
        int variablesCount = ctx.getChildCount();
        instructions.add(instructions.size() - (VARIABLE_INSTRUCTION_COUNT * variablesCount), PL0InstructionsFactory.getInt(variablesCount));
    }

    /**
     * Parse variable (int or boolean) and add to local or global variables
     */
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

    /**
     * Do negation if var contains it
     */
    @Override
    public void exitVar(FJPParser.VarContext ctx) {
        Object child = ctx.getChild(0);
        if(child instanceof TerminalNode){
            if(((TerminalNode)child).getSymbol().getType() == FJPLexer.NEG){
                instructions.add(PL0InstructionsFactory.getLit(0));
                instructions.add(PL0InstructionsFactory.getOpr(8));
            }
        }
    }

    /**
     * Set level for enter to body of procedure / main
     */
    @Override
    public void enterBody(FJPParser.BodyContext ctx) {
        level = 1;
    }

    /**
     * Set level for enter to body of procedure / main
     */
    @Override
    public void exitBody(FJPParser.BodyContext ctx) {
        level = 0;
    }

    /**
     * Get value from ID (identification of local or global variable or constant)
     */
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

    /**
     * Parse value (int or boolean) and put on top of stact if is not call value
     */
    @Override
    public void exitValue(FJPParser.ValueContext ctx) {
        if(ctx.parent != null && ctx.parent.parent != null && !(ctx.parent.parent instanceof FJPParser.CallContext)){
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
    }

    /**
     * Add instruction for logic and, multiple or divine
     */
    @Override
    public void exitTerm(FJPParser.TermContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof TerminalNode){
                switch (((TerminalNode)ctx.getChild(i)).getSymbol().getType()){
                    case FJPLexer.AND:
                        instructions.add(PL0InstructionsFactory.getOpr(2));
                        instructions.add(PL0InstructionsFactory.getLit(2));
                        instructions.add(PL0InstructionsFactory.getOpr(8));
                        break;
                    case FJPLexer.MUL:
                        instructions.add(PL0InstructionsFactory.getOpr(4));
                        break;
                    case FJPLexer.DIV:
                        instructions.add(PL0InstructionsFactory.getOpr(5));
                        break;
                }
            }
        }
    }

    /**
     * Add instruction for plus, minus or logic or
     */
    @Override
    public void exitSimpleExp(FJPParser.SimpleExpContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof TerminalNode){
                switch (((TerminalNode)ctx.getChild(i)).getSymbol().getType()){
                    case FJPLexer.ADD:
                        instructions.add(PL0InstructionsFactory.getOpr(2));
                        break;
                    case FJPLexer.SUB:
                        instructions.add(PL0InstructionsFactory.getOpr(3));
                        break;
                    case FJPLexer.OR:
                        instructions.add(PL0InstructionsFactory.getOpr(2));
                        instructions.add(PL0InstructionsFactory.getLit(1));
                        instructions.add(PL0InstructionsFactory.getOpr(11));
                        break;
                }
            }
        }
    }

    /**
     * Add instruction for logic equal, logic not equal, less, less or same, great or great or same
     */
    @Override
    public void exitExpression(FJPParser.ExpressionContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof TerminalNode){
                switch (((TerminalNode)ctx.getChild(i)).getSymbol().getType()){
                    case FJPLexer.EQUAL:
                        instructions.add(PL0InstructionsFactory.getOpr(8));
                        break;
                    case FJPLexer.NOT_EQUAL:
                        instructions.add(PL0InstructionsFactory.getOpr(9));
                        break;
                    case FJPLexer.LT:
                        instructions.add(PL0InstructionsFactory.getOpr(10));
                        break;
                    case FJPLexer.LE:
                        instructions.add(PL0InstructionsFactory.getOpr(13));
                        break;
                    case FJPLexer.GE:
                        instructions.add(PL0InstructionsFactory.getOpr(11));
                        break;
                    case FJPLexer.GT:
                        instructions.add(PL0InstructionsFactory.getOpr(12));
                        break;
                }
            }
        }
        if(ctx.getParent() instanceof FJPParser.If_elseContext){ // for else jump
            instructions.add(PL0InstructionsFactory.getLit(1));
            instructions.add(PL0InstructionsFactory.getOpr(11));
            elseJump = instructions.size();
            instructions.add(PL0InstructionsFactory.getJmc(0));
        }
    }

    /**
     * Add jump on if and set jump for else
     */
    @Override
    public void exitElse_part(FJPParser.Else_partContext ctx) {
        ifJump = instructions.size();
        instructions.add(PL0InstructionsFactory.getJmp(0));
        instructions.set(elseJump, PL0InstructionsFactory.getJmc(instructions.size()));
    }

    /**
     * Set jump for if
     */
    @Override
    public void exitIf_else(FJPParser.If_elseContext ctx) {
        instructions.set(ifJump, PL0InstructionsFactory.getJmp(instructions.size()));
    }

    /**
     * Get value of assignment for assign
     */
    @Override
    public void exitAssigment(FJPParser.AssigmentContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        for (int i = 0; i < ids.size(); i++) {
            String id = ids.get(i).getText();
            if(localVariables.containsKey(id)){
                instructions.add(PL0InstructionsFactory.getSto(0, localVariables.get(id)));
                if(i != ids.size() - 1){
                    instructions.add(PL0InstructionsFactory.getLod(0, localVariables.get(id)));
                }
            }else if(variables.containsKey(id)){
                instructions.add(PL0InstructionsFactory.getSto(level, variables.get(id) + base)); //global variable
                if(i != ids.size() - 1){
                    instructions.add(PL0InstructionsFactory.getLod(0, localVariables.get(id)));
                }
            }else{
                System.out.println("Neexitujici identifikator: " + id + " : " + ctx.getStart());
                System.exit(1);
            }
        }
    }

    /**
     * Get values of assignment for parallel assign
     */
    @Override
    public void exitAssigment_p(FJPParser.Assigment_pContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        List<FJPParser.VarContext> vars = ctx.var();
        if(ids.size() == vars.size()){
            for (int i = ids.size() - 1; i > -1; i--) {
                String id = ids.get(i).getText();
                if(localVariables.containsKey(id)){
                    instructions.add(PL0InstructionsFactory.getSto(0, localVariables.get(id)));
                }else if(variables.containsKey(id)){
                    instructions.add(PL0InstructionsFactory.getSto(level, variables.get(id) + base)); //global variable
                }else{
                    System.out.println("Neexitujici identifikator: " + id + " : " + ctx.getStart());
                    System.exit(1);
                }
            }
        }else{
            System.out.println("Spatny pocet v prirazeni: " + ctx.getStart());
            System.exit(1);
        }
    }

    /**
     * Save instruction for repeat until cycle
     */
    @Override
    public void enterRe_until(FJPParser.Re_untilContext ctx) {
        cycleJump = instructions.size();
    }

    /**
     * Add instruction for repeat until condition
     */
    @Override
    public void exitRe_until(FJPParser.Re_untilContext ctx) {
        instructions.add(PL0InstructionsFactory.getLit(1));
        instructions.add(PL0InstructionsFactory.getOpr(10));
        instructions.add(PL0InstructionsFactory.getJmc(cycleJump));
    }

    /**
     * Save instruction for do while cycle
     */
    @Override
    public void enterDo_while(FJPParser.Do_whileContext ctx) {
        cycleJump = instructions.size();
    }

    /**
     * Add instruction for do while condition
     */
    @Override
    public void exitDo_while(FJPParser.Do_whileContext ctx) {
        instructions.add(PL0InstructionsFactory.getLit(1));
        instructions.add(PL0InstructionsFactory.getOpr(10));
        instructions.add(PL0InstructionsFactory.getJmc(cycleJump));
    }

    /**
     * Save instruction for while do cycle
     */
    @Override
    public void enterWhile_do(FJPParser.While_doContext ctx) {
        cycleJump = instructions.size();
    }

    /**
     * Add instruction for while do condition and save cycle end position
     */
    @Override
    public void exitStart_do(FJPParser.Start_doContext ctx) {
        instructions.add(PL0InstructionsFactory.getLit(1));
        instructions.add(PL0InstructionsFactory.getOpr(11));
        cycleEndJump = instructions.size();
        instructions.add(PL0InstructionsFactory.getJmc(-1));
    }

    /**
     * Add instruction for while do condition
     */
    @Override
    public void exitWhile_do(FJPParser.While_doContext ctx) {
        instructions.add(PL0InstructionsFactory.getJmp(cycleJump));
        instructions.set(cycleEndJump, PL0InstructionsFactory.getJmc(instructions.size()));
    }

    /**
     * Create call procedure with arguments
     */
    @Override
    public void exitCall(FJPParser.CallContext ctx) {
        String id = ctx.ID().getText();
        if(procedures.containsKey(id)){
            Procedure procedure = procedures.get(id);
            List<Integer> procedureArgumentsValues = new ArrayList<>();
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if(ctx.getChild(i) instanceof FJPParser.VarContext){
                    ParseTree child = ctx.getChild(i).getChild(0);
                    if(child instanceof FJPParser.ValueContext){
                        procedureArgumentsValues.add(Integer.parseInt(child.getText()));
                    }else if(child instanceof FJPParser.IdsContext){
                        int value = DEFAULT_VALUE;
                        String text = child.getText();
                        if(constants.containsKey(text)){
                            value = constants.get(text);
                        }
                        procedureArgumentsValues.add(value);
                    }
                }
            }
            List<Integer> procedureArgumentsForSet = procedure.getArguments();
            if(procedureArgumentsValues.size() == procedureArgumentsForSet.size()){
                for (int i = 0; i < procedureArgumentsValues.size(); i++) {
                    instructions.set(procedureArgumentsForSet.get(i), PL0InstructionsFactory.getLit(procedureArgumentsValues.get(i)));
                }
            }else{
                System.out.println("Spatne parametry u procedury: " + id + " : " + ctx.getStart());
                System.exit(1);
            }
            instructions.add(PL0InstructionsFactory.getCal(level, procedure.getAddress()));
        }else{
            System.out.println("Neexitujici procedura: " + id + " : " + ctx.getStart());
            System.exit(1);
        }
    }

    /**
     * Set instruction for save return value of procedure
     */
    @Override
    public void exitReturn_id(FJPParser.Return_idContext ctx) {
        if(ctx != null){
            Procedure procedure = procedures.get(((FJPParser.CallContext)ctx.getParent()).ID().getText());
            int address = procedure.getReturnAddress();
            if(address != -1){
                String id = ctx.ID().getText();
                if(localVariables.containsKey(id)){
                    instructions.set(address, PL0InstructionsFactory.getSto(level, base + localVariables.get(id)));
                }else if(variables.containsKey(id)){
                    instructions.set(address, PL0InstructionsFactory.getSto(level, base + variables.get(id)));
                }else{
                    System.out.println("Neexistujici promenna pro zapsani navratove hodnoty: " + id + " : " + ctx.getStart());
                    System.exit(1);
                }
            }
        }
    }

    /**
     * Clear local variable before main started and save main address for calling main after set globals
     */
    @Override
    public void enterMain(FJPParser.MainContext ctx) {
        mainAddress = instructions.size();
        localVariables.clear();
    }

    /**
     * Exit main and set jump after set global variables
     */
    @Override
    public void exitMain(FJPParser.MainContext ctx) {
        instructions.add(PL0InstructionsFactory.getRet());
        instructions.set(globalsEndAddress, PL0InstructionsFactory.getJmp(mainAddress));
    }

    /**
     * Print instruction on standard output
     */
    private void printInstructions(){
        for (int i = 0; i < instructions.size(); i++) {
            System.out.println(i + "\t" + instructions.get(i));
        }
    }

    /**
     * Parse variable context - int or boolean
     * @return name of variable
     */
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

    /**
     * Parse int value from node (string)
     * @return int value
     */
    private int parseIntValue(TerminalNode terminalNode) {
        int value = DEFAULT_VALUE;
        if(terminalNode != null){
            value = Integer.parseInt(terminalNode.getText());
        }
        return value;
    }

    /**
     * Parse bolean value from node (string)
     * @return boolean value
     */
    private int parseBooleanValue(TerminalNode terminalNode) {
        int value = DEFAULT_VALUE;
        if(terminalNode != null && terminalNode.getText().equals(TRUE_TEXT)){
            value = TRUE_VALUE;
        }
        return value;
    }

    /**
     * Add variable to stack
     */
    private void addVariable(int address, int value) {
        instructions.add(PL0InstructionsFactory.getLit(value));
        instructions.add(PL0InstructionsFactory.getSto(0, address));
    }
}
