// check a string contains non-word characters
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class NonWordCharcters
{
    public static void main(String[] args)
    {
        String str = "Hi_123 @Java #2025";

        // // zero or multiple
        // Pattern pt = Pattern.compile("\\W*"); // pre-defined character class
        // Pattern pt2 = Pattern.compile("[^a-zA-Z_0-9]*"); // custom character class

        // // one or multiple
        // Pattern pt3 = Pattern.compile("\\W+"); // pre-defined character class
        // Pattern pt4 = Pattern.compile("[^a-zA-Z_0-9]+"); // custom character class

        // // zero or one
        // Pattern pt5 = Pattern.compile("\\W?"); // pre-defined character class
        Pattern pt6 = Pattern.compile("[^a-zA-Z_0-9]?"); // custom character class

        Matcher mt = pt6.matcher(str);

        while(mt.find()) {
            System.out.println("'" + mt.group() + "' found at " + mt.start() + "-" + mt.end());
        }
    }
}
