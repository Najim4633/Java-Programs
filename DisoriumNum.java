//wajp for disorium number (135=1^1+3^2+%^3=135)
import java.util.Scanner;
public class DisoriumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int length = islength(n);
        int sum = isDisorium(n,length);
        System.out.println(sum);
        System.out.println((sum==n)?true:false);
}
public static int islength(int n) {
    int count = 0;
    while (n != 0) {
        n = n / 10;
        count++;
        }
    return count;
}

public static int isDisorium(int n, int length)
{
    int sum = 0;
    
    for(int i=n; i>0; i/=10)
    {
        int rem = i%10;
        // System.out.println("reminder is "+135rem);
        int pow=1;
        for(int j=1; j<=length;j++)
        {
            pow*=rem;
        }
        System.out.println("power of "+rem+ "  is "+pow);
        length--;
        sum+=pow;
    }
    return sum;
}
}
