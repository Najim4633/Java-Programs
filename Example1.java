//write a java program to find n^b;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number :");
        int n = sc.nextInt();
        System.out.print("Enter the exponent :");
        int b = sc.nextInt();
        int result=1;

        while (b>0) {
            result *= n;
            b--;
            
        }
        System.out.println("Result is " + result);
        }
    
}
