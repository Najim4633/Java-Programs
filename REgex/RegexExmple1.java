import java.util.regex.*;
public class RegexExmple1 {
    public static void main(String[] args) {
        String str = "JAVa is Pl\njava is HLL \nJAVA is multithreded \nIt suppourt wora JAVA";


        Pattern pattern = Pattern.compile("^JAVA", Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
        Matcher matcher =pattern.matcher(str);
        //System.out.println(str);
        System.out.println(Pattern.MULTILINE+ " " +Pattern.CASE_INSENSITIVE +" "+( Pattern.MULTILINE|Pattern.CASE_INSENSITIVE));
        while (matcher.find()) {
            System.out.println(matcher.group()+" : "+matcher.start()+" : "+matcher.end());
            
        }
    }
    
}
