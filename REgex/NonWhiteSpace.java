// check a string contains non-whitespace characters
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class NonWhiteSpace
{
    public static void main(String[] args)
    {
        String str = "Hello World\tJava\n2025";

        // // zero or multiple
        // Pattern pt = Pattern.compile("\\S*"); // pre-defined character class
        // Pattern pt2 = Pattern.compile("[^ \\t\\n\\x0B\\f\\r]*"); // custom character class

        // // one or multiple
        // Pattern pt3 = Pattern.compile("\\S+"); // pre-defined character class
        // Pattern pt4 = Pattern.compile("[^ \\t\\n\\x0B\\f\\r]+"); // custom character class

        // // zero or one
        // Pattern pt5 = Pattern.compile("\\S?"); // pre-defined character class
        Pattern pt6 = Pattern.compile("[^ \\t\\n\\x0B\\f\\r]?"); // custom character class

        Matcher mt = pt6.matcher(str);

        while(mt.find()) {
            System.out.println("'" + mt.group() + "' found at " + mt.start() + "-" + mt.end());
        }
    }
}
