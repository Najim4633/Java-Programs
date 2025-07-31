public class AnagramString {
    public static void main(String[] args) {
        String str1= "hello";
        String str2 ="lohe";
        if(isAnagram(str1, str2))
        {
            System.out.println("angraam");
        }
        else{
            System.out.println("not Anagram");
        }
        
    }
    private static boolean isAnagram(String str, String str2)
    {
        if(str.length()!=str2.length()) return false;
        char[] ch1= str.toCharArray();
        char[] ch2 = str.toCharArray();
        bubbleSort(ch1);
        bubbleSort(ch2);
        for(int i=0; i<ch1.length;i++)
        {
            if(ch1[i]!=ch2[i])return false;
        }
        return true;
        
        
    }
    private static void bubbleSort(char[] ch) {
        for(int i=0; i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]>ch[j])
                {
                    char temp= ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
    }
}
