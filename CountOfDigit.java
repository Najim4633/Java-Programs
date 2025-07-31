//define a method to return count of digit of number 
import java.util.Scanner;
public class CountOfDigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
   
    System.out.println("count of anumber: "+  countDigit(n));
}
public static int countDigit(int n)
{
    int count = 0;
    for(int i=n;i>0;i/=10)
    {
        
        count++;
        //System.out.println("count is "+count);
    }
    return count;
}
}
