
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.*;


public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Usage: java Main <input-file>");
            return;
        }

        CharStream input = CharStreams.fromPath(Paths.get(args[0]));

        HashLexer lexer = new HashLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HashParser parser = new HashParser(tokens);

        ParseTree tree = parser.program();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.out.println("Syntax errors found. Semantic checking skipped.");
            return;
        }

        SemanticChecker checker = new SemanticChecker();

        checker.collectDef(tree);
        checker.SemanticCheck(tree);

        if (checker.getError().isEmpty()) {
            System.out.println("Semantic check passed.");
        } else {
            System.out.println("Semantic errors:");
            for (String error : checker.getError()) {
                System.out.println(error);
            }
        }
    }
}