import java.util.*;

public class StringProblemsRemaining {
    public static void main(String[] args) {
        String str1 = "banana";
        String str2 = "1234";
        String str3 = "12a3";
        String sentence = "I love Java programming";
        String anagram1 = "listen";
        String anagram2 = "silent";
        String rotation1 = "abcd";
        String rotation2 = "cdab";
        String pangram = "The quick brown fox jumps over the lazy dog";
        String repeatStr = "swiss";
        String palindromeStr = "babad";

        // Easy/Medium
        //System.out.println(countCharFrequency(str1));
        // System.out.println(containsOnlyDigits(str2));
        //  System.out.println(containsOnlyDigits(str3));
          //System.out.println(stringToInteger("12345"));
        //  System.out.println(reverseWords(sentence));
        //  System.out.println(findLongestWord(sentence));

        // // Medium/Hard
         //System.out.println(areAnagrams(anagram1, anagram2));
        // System.out.println(findAllSubstrings("abc"));
        // System.out.println(isRotation(rotation1, rotation2));
        // System.out.println(isPangram(pangram));
        // System.out.println(firstRepeatedChar(repeatStr));
        // System.out.println(longestPalindromeSubstring(palindromeStr));
    }

    // 8. Count frequency of each character
    public static Map<Character, Integer> countCharFrequency(String str) {
        Set<Character> charset=new LinkedHashSet<>();
         List<Character> list=new ArrayList<>();
        
        for(char ch: str.toCharArray()){ charset.add(ch);
        list.add(ch);}
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(Character ch : charset)
        {
            map.put(ch, Collections.frequency(list, ch));
        }
        return map;

    }

    // 9. Check if string contains only digits
    public static boolean containsOnlyDigits(String str) {
        return(str.contains("^0-9"));
    }

    // 10. Convert string to integer (without parseInt)
    public static int stringToInteger(String str) {
        int res=0;
        for(int i=0;i<str.length();i++)
        {
            res=(res*10)+str.charAt(i)-48;
        }
        return res;
    }

    // 11. Reverse words in a sentence
    public static String reverseWords(String sentence) {
        String[] strArr= sentence.split(" ");
        StringBuilder newstr =new StringBuilder();
        for(String str: strArr)
        {
            str=StringProblems.reverseString(str);
            newstr.append(str+" ");
        }
        return newstr.toString();
        
    }

    // 12. Find longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] strArr =sentence.split(" ");
        int max=Integer.MIN_VALUE;
        String bigword="";
        for(String str : strArr)
        {
            if(str.length()>max)
            {
                max=str.length();
                bigword=str;
            }
        }
        return bigword;
    }

    // 13. Check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        if(str1.length()!=str2.length())return false;
        char[] charr=str1.toCharArray();
        for(int i=0; i<charr.length;i++)
        {
            
        }
        return true;
    }

    // 14. Find all substrings of a string
    public static List<String> findAllSubstrings(String str) {
        return null;
    }

    // 15. Check if one string is rotation of another
    public static boolean isRotation(String s1, String s2) {
        return false;
    }

    // 16. Check if string is pangram
    public static boolean isPangram(String str) {
        return false;
    }

    // 17. Find the first repeated character
    public static char firstRepeatedChar(String str) {
        return '\0'; // null char if not found
    }

    // 18. Find the longest palindrome substring
    public static String longestPalindromeSubstring(String str) {
        return null;
    }
}
