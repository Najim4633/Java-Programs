import java.util.Arrays;

public class ReverseSpecialString {
    public static void main(String[] args) {
        {
            String str ="ni@te_sh$";//hs@et_in$
            String str1= "@_";
            System.out.println(str1);
            System.out.println(reverseSpecial(str1));
            String newstr=reverseSpecial(str);
            System.out.println(str);
            System.out.println(newstr);
        }
    }

    private static String reverseSpecial(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (!letterOrDigit(arr[i])) {
                i++;
            } else if (!letterOrDigit(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }
     public static boolean letterOrDigit(char ch) {
     
        if (ch >= 'A' && ch <= 'Z') return true;
        else if (ch >= 'a' && ch <= 'z') return true;
        else if (ch >= '0' && ch <= '9') return true;
        else 
            return false; 
    }
}
