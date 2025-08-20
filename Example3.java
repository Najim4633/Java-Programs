//write a java program to find armstrong num
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int temp2=n;

        int count=0;
        while(temp>0)
        {
            int rem=temp%10;
            count++;
            temp/=10;
        }
        while(n>0)
        {
            int rem = n%10;
            

            sum += rem;
            n /= 10;
        }
        if(temp2==sum)
        {
            System.out.println("enter number is armstrong num");
        }
        else
        System.out.println("number is not armstrong");
    }
}
