public class Solution {
    public static void main(String[] args) {
        primeFactors(10591);
        System.out.print(isPalindrome(121));

        
    }
    public static void primeFactors(int n)
    {
        System.out.println("prime factors of "+n+" are : ");
        while(n%2==0){
            System.out.print(2+", ");
            n/=2;

        }
        for(int i=3;i<n/2;i+=2)
        {
            if(n%i==0)
            {
                System.out.print(i+", ");
                n/=i;
            }

        }
        if(n>0)
        {
            System.out.println(n);
        }
    }
    public static boolean isPalindrome(int x) {
        int rus=0;
        for(int i=x;i!=0;i/=10)
        {
            rus=(i%10)+(rus*10);
        }
        return rus==x;    
        
    }
    
}
