import java.util.regex.Matcher;
import java.util.regex.Pattern;

class First
{
    public static void main(String[] args) {
        String str = "java is a programming langvauge java was created by sun JAVA is hll";
        Pattern pattern =Pattern.compile("[A-Z]",Pattern.CASE_INSENSITIVE);
        Matcher matcher =pattern.matcher(str);
        System.out.println(" main string "+str);

        System.out.println("regex "+pattern.toString());
        while(matcher.find()){
            System.out.println(matcher.start()+" : "+matcher.end()+" : "+matcher.group());
        }

    }
}