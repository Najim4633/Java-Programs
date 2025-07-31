public class Stringexe {
    static String newstr;
    public static void main(String[] args) {
        String str ="Hello @#$%%@#$%%#$%World";
        int strlen = str.length();

        for(int i=0; i<strlen; i++)
        {
            if(str.charAt(i)<65||str.charAt(i)>122)
            {
                continue;
            }
            newstr+=str.charAt(i);
        }
        System.err.println(newstr);
    }
    
}
