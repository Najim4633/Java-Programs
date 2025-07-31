import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range to find all primes");
        int range =sc.nextInt();
        for(int i=2; i<=range; i++)
        {
           // boolean res = (isprime(i));
            if(isprime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isprime(int n)
    {
        for(int i =2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                return false;
            }
            
             
            
        }
        return true;
    }
}   
   


