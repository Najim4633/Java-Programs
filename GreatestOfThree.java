//wap to find greatest of three num by using conditional opertor
import java.util.Scanner;
class GreatestOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        int max = (a > b) ? ((a > c) ? a : c) :(b > c? b: c );

        System.out.println("max num is: "+ max);
}
}
