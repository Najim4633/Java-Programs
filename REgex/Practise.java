public class Practise {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AZ"));
    }

    public static  int titleToNumber(String str) {

        int sum=0;
        for(int i=str.length()-1,indx=0; i>=0;i--,indx++)
        {
            int temp =str.charAt(i)-64;
            sum+=(Math.pow(26, indx)*temp);

        }
        return sum;
    }
}
