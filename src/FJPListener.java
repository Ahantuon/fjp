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
    private static final int DEFAULT_VALUE = 0;
    private static final int TRUE_VALUE = 1;
    private Map<String, Integer> constants;
    private Map<String, Integer> variables;

    private int base;
    private int top;
    private int level;
    private List<String> instructions;

    public FJPListener() {
        base = 1;
        top = 0;
        level = 0;
        constants = new HashMap<>();
        variables = new HashMap<>();
        instructions = new ArrayList<>();
    }

    @Override
    public void enterProgram(FJPParser.ProgramContext ctx){
        instructions.add(PL0InstructionsFactory.getJmp(1));
    }

    @Override
    public void exitGlobals(FJPParser.GlobalsContext ctx){
        int count = ctx.getChildCount();
        instructions.add(instructions.size() - (2 * count), PL0InstructionsFactory.getInt(STACK_SIZE + count));
    }

    @Override
    public void exitConstant(FJPParser.ConstantContext ctx) {
        constants.put(ctx.ID().getText(), Integer.parseInt(ctx.INT_VALUE().getText()));
    }

    @Override
    public void exitInt_var(FJPParser.Int_varContext ctx){
        int value = DEFAULT_VALUE;
        String name = ctx.ID().getText();
        if(ctx.INT_VALUE() != null){
            value = Integer.parseInt(ctx.INT_VALUE().getText());
        }
        int address = STACK_SIZE + variables.size();
        instructions.add(PL0InstructionsFactory.getLit(value));
        instructions.add(PL0InstructionsFactory.getSto(level, address));
        variables.put(name, address);
    }

    @Override
    public void exitBoolean_var(FJPParser.Boolean_varContext ctx){
        int value = DEFAULT_VALUE;
        String name = ctx.ID().getText();
        if(ctx.BOOLEAN_VALUE() != null && ctx.BOOLEAN_VALUE().getText().equals("true")){
            value = TRUE_VALUE;
        }
        int address = STACK_SIZE + variables.size();
        instructions.add(PL0InstructionsFactory.getLit(value));
        instructions.add(PL0InstructionsFactory.getSto(level, address));
        variables.put(name, address);
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
            System.out.println("Nastala chyba pri prekladu: " + e.getMessage());
        }
    }
}
