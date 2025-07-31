import java.util.Arrays;

public class ReverseStringWords {
    public static void main(String[] args) {
        String str= "I love India";
        String newstr=solve(str);
        System.out.println(newstr);
        

    }
    public static String solve( String str)
    {
        String[] arr =str.trim().split(" ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=reverseString(arr[i]);
        }
        String newstr="";
        for(String ele: arr)
        {
            newstr+=(ele+" ");
        }
        return newstr.trim();
    }
    public static String reverseString(String str)
    {
        String str1 ="";
        for( int i=str.length()-1; i>=0;i-- )
        {
            str1+=str.charAt(i);
        }
        return str1;

    }
    
    
}
