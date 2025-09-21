public class Parenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }
    
    public static boolean isValid(String s) {
        if(s.length()%2!=0) return false;

        for( int i=0,j=s.length()-1; i<j; i++,j--)
        {
            System.out.println(s.charAt(i)+"  "+s.charAt(j));
            if(s.charAt(i)!=s.charAt(j))return false;
        }
        return true;
    }
    
}

   