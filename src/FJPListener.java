package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

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

    private Map<String, Integer> constants;
    private Map<String, Integer> variables;
    private Map<String, Integer> localVariables;
    private Map<String, Procedure> procedures;


    private int base;
    private int top;
    private int level;
    private List<String> instructions;
    private int procedureEnter = 0;

    public FJPListener() {
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
    public void exitGlobals(FJPParser.GlobalsContext ctx){
        int variablesCount = ctx.getChildCount();
        int totalSize = STACK_SIZE + variablesCount;
        instructions.add(instructions.size() - (VARIABLE_INSTRUCTION_COUNT * variablesCount), PL0InstructionsFactory.getInt(totalSize));
        top = totalSize;
    }

    @Override
    public void exitConstant(FJPParser.ConstantContext ctx) {
        constants.put(ctx.ID().getText(), Integer.parseInt(ctx.INT_VALUE().getText()));
    }

    @Override
    public void exitGlobal(FJPParser.GlobalContext ctx) {
        int value = DEFAULT_VALUE;
        String name;
        if(ctx.int_var() != null){
            name = ctx.int_var().ID().getText();
            if(ctx.int_var().INT_VALUE() != null){
                value = Integer.parseInt(ctx.int_var().INT_VALUE().getText());
            }
        }else{
            name = ctx.boolean_var().ID().getText();
            if(ctx.boolean_var().BOOLEAN_VALUE() != null && ctx.boolean_var().BOOLEAN_VALUE().getText().equals("true")){
                value = TRUE_VALUE;
            }
        }
        int address = STACK_SIZE + variables.size();
        instructions.add(PL0InstructionsFactory.getLit(value));
        instructions.add(PL0InstructionsFactory.getSto(level, address));
        variables.put(name, address);
    }

    @Override
    public void enterProcedure(FJPParser.ProcedureContext ctx) {
        procedureEnter = instructions.size();
        localVariables.clear();
        level = 1;
    }

    @Override
    public void enterArgument(FJPParser.ArgumentContext ctx) {
        //TODO
    }

    @Override
    public void exitProcedure(FJPParser.ProcedureContext ctx) {
        procedures.put(ctx.ID().getText(), new Procedure(procedureEnter, STACK_SIZE + ctx.body().locales().locale().size()));
        instructions.add(PL0InstructionsFactory.getRet());
        level = 0;
    }

    @Override
    public void exitMain(FJPParser.MainContext ctx) {
        printInstructions();
    }

    private void printInstructions(){
        for (int i = 0; i < instructions.size(); i++) {
            System.out.println(i + "\t" + instructions.get(i));
        }
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
