import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class SimpleCodeRunner {

	public static void main(String[] args) throws Exception {
		
		
		
		/*ANTLRInputStream input = new ANTLRInputStream("print 123");
		
		SimpleCodeLexer lexer = new SimpleCodeLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		SimpleCodeParser parser = new SimpleCodeParser(tokens);
		ParseTree tree = parser.scanner();
		System.out.println(tree.toStringTree(parser));*/
		
		// === READ FILE
		StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("D:\\Desktop\\parser\\illegal-01"))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        //System.out.println(sb);
        
        // === SCANNER PARSER
        ANTLRInputStream input = new ANTLRInputStream(sb.toString());
        System.out.println("---->> Scanner Parser <<----");
        System.out.print(input);
        System.out.println("\n");
		
		SimpleCodeLexer lexer = new SimpleCodeLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		SimpleCodeParser parser = new SimpleCodeParser(tokens);
		
		ParseTree tree = parser.program();
		System.out.println("\n-------------------------");
		System.out.println(tree.toStringTree(parser));
	}

}
