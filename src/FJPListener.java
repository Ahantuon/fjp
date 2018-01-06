package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class FJPListener extends FJPParserBaseListener{

    private Map<String, Integer> variables;

    public FJPListener() {
        variables = new HashMap<>();
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
            e.printStackTrace();
        }
    }
}
