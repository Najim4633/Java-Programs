public class ReverseString {
    public static void main(String[] args) {
        String str= "alphxxdida";
        System.out.println(solution(str));
        
    }
    public static int solution(String str)
    {
        String newstr= revString(str);
        int op=0;
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)==newstr.charAt(i))
            {
                op++;
            }
        }
        return op;
    }
    public static String revString(String str)
    {
        String revstr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            revstr+=str.charAt(i);
        }
        return revstr;
    }
}
