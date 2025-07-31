//wap java program to find even odd without using modulas operator
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        int res= a/2;
        
        if(a==res*2) {
            System.out.println("Even");
            }
        else{
            System.out.println("Odd");
        }

        
    }
    
}
