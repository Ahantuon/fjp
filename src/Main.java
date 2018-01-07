package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.parser.FJPLexer;
import src.parser.FJPParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {

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
