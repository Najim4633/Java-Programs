//write a java proram to reverse a num
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int dup =num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("user enter number:  "+dup +"  reverse num: "+rev);
    }

    
}
