package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class FJPListener extends FJPParserBaseListener{
    private Map<String, Integer> constants;
    private Map<String, Integer> variables;

    public FJPListener() {
        constants = new HashMap<>();
        variables = new HashMap<>();
    }

    @Override
    public void exitConstant(FJPParser.ConstantContext ctx) {
        constants.put(ctx.getChild(1).getText(), Integer.parseInt(ctx.getChild(3).getText()));
    }

    @Override
    public void exitGlobal(FJPParser.GlobalContext ctx) {
        if(ctx.int_var() != null){
            int value = 0;
            if(ctx.int_var().INT_VALUE() != null){
                value = Integer.parseInt(ctx.int_var().INT_VALUE().getText());
            }
            variables.put(ctx.int_var().ID().getText(), value);
        } else if(ctx.boolean_var() != null){
            int value = 0;
            if(ctx.boolean_var().BOOLEAN_VALUE() != null && ctx.boolean_var().BOOLEAN_VALUE().getText().equals("true")){
                value = 1;
            }
            variables.put(ctx.boolean_var().ID().getText(), value);
        }
    }

    @Override
    public void exitMain(FJPParser.MainContext ctx) {
        System.out.println("Test: " + ctx.getText());
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
