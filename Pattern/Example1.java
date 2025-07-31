//if input number have 0 replace it from 5
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter your number");
      int num=sc.nextInt();
      int m=1;
      int res=0;

      for(int i= num; i>0 ;i/=10)
    {
        int rem= num%10;
        if(rem==0)
            rem=5;
        res=res*m+rem;
        m*=10;

    } 
    System.out.println(res);
   }
    
}
