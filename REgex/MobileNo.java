import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNo {
public static void main(String[] args) {
        String str = "agn23kaf32msdkd13ka2";
        Pattern pattern =Pattern.compile("\\d");
        Matcher matcher =pattern.matcher(str);
        System.out.println(" main string "+str);

        System.out.println("regex "+pattern.toString());
        while(matcher.find()){
            System.out.println(matcher.group()+" : "+matcher.end()+" : "+matcher.start());
        }

    }

    
}
