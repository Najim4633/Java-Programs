// wap to find biggest and smallest digit of a number
import java.util.Scanner;
public class SmallestandBiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num ");
        int n = sc.nextInt();
        int big = -9;
        int small = 9;
        while (n != 0) {
            int rem = n % 10;
            if (rem > big) {
                big = rem;
                }
            if (rem < small) {
                small = rem;
            }
            n = n / 10;
            }
        System.out.println("biggest number is "+big);
        System.out.println("smallest number is "+small);

                
    }
}
