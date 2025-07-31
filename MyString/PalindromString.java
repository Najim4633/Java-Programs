public class PalindromString {
    public static void main(String[] args) {
        String str= "racecar";
        System.out.println(solve(str));
        
    }
    private static boolean solve(String str)
    {
        str=str.replaceAll("[^A-Za-z]", "");
        int i= 0;
        int j=str.length()-1;
        while ((i<j)) {
            if(!(str.charAt(i++)==str.charAt(j--))) return false;
            
        }
        return true;
    }
    
}
