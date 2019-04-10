import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class SimpleCodeRunner {
	private static String[] filterList = {"IDENTIFIER","INTLITERAL","CHARLITERAL","STRINGLITERAL","BOOLEANLITERAL"};
	
	private static boolean checkExistInFilterList(String str)
	{
		for(int i=0; i<filterList.length; i++)
		{
			if(filterList[i].equals(str))
				return true;
		}
		return false;
	}
	
	public static void printOutChildNode(TerminalNodeImpl child, SimpleCodeLexer lexers)
	{
		
		int line = child.getSymbol().getLine();
		String lexer = child.getText();
		String token = lexers.getRuleNames()[child.getSymbol().getType() - 1];
		
		if(checkExistInFilterList(token)) {
			System.out.println(line + " " + token + " " + lexer);
		}
		else {
			System.out.println(line + " " + lexer);
		}
				
	}
	
	public static void flattenTree(ParseTree parent, SimpleCodeLexer lexers)
	{
		for(int i=0; i<parent.getChildCount();i++)
		{
			ParseTree child = parent.getChild(i);
			if(!(child instanceof ErrorNodeImpl)) {
				if((child instanceof TerminalNodeImpl) && (child.getText().trim().equals(""))) {
					printOutChildNode((TerminalNodeImpl)(child), lexers);
				}
				else {
					flattenTree(child, lexers);
				}
			}
			else {
				printOutChildNode((TerminalNodeImpl)(child), lexers);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		
		
		
		/*ANTLRInputStream input = new ANTLRInputStream("print 123");
		
		SimpleCodeLexer lexer = new SimpleCodeLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		SimpleCodeParser parser = new SimpleCodeParser(tokens);
		ParseTree tree = parser.scanner();
		System.out.println(tree.toStringTree(parser));*/
		
		// === READ FILE
		StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("D:\\Desktop\\scanner\\char1"))) {

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

		flattenTree(tree, lexer);
	
		
		//System.out.println(tree.toStringTree(parser));
	}

}
