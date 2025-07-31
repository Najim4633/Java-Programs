//find prime number in range
import java.util.Scanner;
class PrimeRange
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        for(int i=1; i<=range; i++)
        {
            
            if(isprime(i,2))System.out.println("prime num  "+ i);
            //else System.out.println("no prime numbers ");
        }
    }
    public static boolean isprime(int n,int i)
    {
        if(n<=1) return false;
        if(i>n/2) return true;
        if(n%i==0) return false;
        i++;
        return (isprime(n,i));
        // for(int i=2; i<=n/2; i++)
        // {
        //     if(n%i==0)
        //     {
        //         return false;
        //     }
        // }
        // return true;
    }
}
