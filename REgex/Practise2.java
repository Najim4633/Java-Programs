public class Practise2 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        
    }
        public  static String convertToTitle(int num) {
        char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        StringBuilder str=new StringBuilder();
        while(num>0)
        {
            num--;
            char a= (char) ((num%26)+65);
            str.insert(0, a);
            System.out.println(num);
            num/=26;
        }
            return new String(str);

        
    }
}
