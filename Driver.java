//write a java program to take three diffrent user number and print it in assending order
import java.util.Scanner; 
public class Driver {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num");
        int a = sc.nextInt();
        System.out.println("enter second num");
        int b = sc.nextInt();
        System.out.println("enter third num");
        int c = sc.nextInt();
        int max = (a>b)?(a>c?a:c):(b>c?b:c);
        int min = (a<b)?(a<c?a:c):(b<c?b:c);
        int mid = (a+b+c)-(max+min);
        System.out.println("The numbers in ascending order are: "+min+" "+mid+" "+max);
        sc.close();
    }
    
}
