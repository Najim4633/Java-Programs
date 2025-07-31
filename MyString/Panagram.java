import java.util.Arrays;

public class Panagram {
    public static void main(String[] args) {
        String str="abcdafgasefghijafaaklmnopqrstuvwxyz";
        String str2 ="zamfas";
        if(isPanagram(str))
        {
            System.out.println("String is panagram");
        }
        else{
            System.out.println("string is not panagram");
        }
    }

    private static boolean isPanagram(String str) {
        str=str.toLowerCase().replaceAll("[^a-z]", "");
        char[] arr= str.toCharArray();
        Arrays.sort(arr);
        char ch='a';
        for(char i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                ch++;
            }
        }
        if(ch>'z') return true;
        return false;
    }
}
