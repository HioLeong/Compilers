import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException;
import java.io.InputStream;
import java_cup.runtime.Symbol;
import ast.*;
import visitor.*;

public class QC {
	private static Lexer lex;
	private static parser pccParser;
    private static InputStream input = System.in;

	/**
	 * Prints the int value of tokens created by the lexer object and values
	 * within the token object (if any)
	 * 
	 * @throws IOException
	 */
	private static void lexicalAnalysisOnly() throws IOException {
		Symbol token;
		while ((token = lex.next_token()).sym != 0) {
			System.out.print(token.toString());
			System.out.println(token.value != null ? "(" + token.value.toString() + ")" : "");
		}
	}

        private static boolean processCommandLine(String[] args) throws FileNotFoundException {
            boolean lexOnly = false;
                for (String arg : args) {
                    if (arg.equalsIgnoreCase("--lex")) {
                        lexOnly = true;
                    } else {
                        input = new FileInputStream(arg);
                    }
                }
            return lexOnly;
        }

	public static void main(String[] args) throws FileNotFoundException {
		Lexer myScanner = new Lexer(new BufferedReader(new FileReader(args[0])));
		parser myParser = new parser(myScanner);
	try{
		Symbol result= myParser.parse();
		Program root = (Program)result.value;
		SementicVisitor sv = new SementicVisitor();
		root.accept(sv);
		System.out.println("--------------------------------------------------------------------------");
	} catch(Exception e){
		e.printStackTrace();
		System.out.println("\n - Error in processing P File.");
		//myParser.parseSuccessReport(false);
	}
	}
}
