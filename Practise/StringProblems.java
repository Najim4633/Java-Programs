import java.util.*;

public class StringProblems {
    public static void main(String[] args) {
    //     System.out.println(checkPalindrome("madam"));
    //    System.out.println(reverseString("hello java"));
    //    System.out.println(removeWhitespsaces("a b c d"));
      // System.out.println(Arrays.toString(countVovelsandConsonents("education")));
    //    System.out.println(countWord("hello my friend how are you"));
    // System.out.println(removeDuplicates("Hello my name is najim tamboli"));
    // System.out.println(removeduplicatesSecond("Hello my name is najim tamboli"));
    System.out.println("firstchar: "+FirstNonRepeatSecond("hheoell"));


    }

    private static int[] countVovelsandConsonents(String string) {
        int vowels=0, consonents=0;
        for(int i=0;i<string.length();i++)
        {
            if(isVowels(string.charAt(i))) vowels++;
            else consonents++;
        }
        return new int[]{vowels,consonents};
    }
    public static boolean isVowels(char ch)
    {
        switch (ch) {
            case 'a','e','i','o','u': return true;
            default: return false;
        }
    }

    private static boolean checkPalindrome(String string) {
        string=string.trim();
        for(int i=0, j=string.length()-1;i<j;i++,j--)
        {
            if(string.charAt(i)!=string.charAt(j)) return false;
        }
        return true;
    }

    public static String reverseString(String string) {
        StringBuilder str = new StringBuilder(string.length());
        for(int i=string.length()-1;i>=0;i--)
        {
            str.append(string.charAt(i));
        }
        return new String(str);


    }

    private static String removeWhitespsaces(String string) {
        String newstr=string.replace(" ", "");
        return newstr;
    }

    private static void countWord(String string) {
        
    }
    private static String removeDuplicates(String str)
    {  
        char[] strArr=str.toCharArray();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char ch: strArr ) set.add(ch);
        StringBuilder newstr=new StringBuilder();
        for(Character ch: set)
        {
            newstr.append(ch);
        }
        return new String(newstr);
    }

    private static char FirstNonRepeatSecond(String str)
    {
        boolean[]flags=new boolean[str.length()];
        for(int i=0; i<str.length();i++)
        {
            int count=0;
            if(flags[i]) continue;
            for(int j=i; j<str.length();j++)
            {
                System.out.println(i+" "+j +" "+str.charAt(i)+"  "+str.charAt(j));
                if(str.charAt(i)==str.charAt(j)) {
                    
                    flags[j]=true;
                    count++;
                }
            }
            System.out.println(count);
            if(count==1) return str.charAt(i);
               
        }
        return '\0';
    }
    
}
