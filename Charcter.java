//wap to find user enter charcter is alphabate digit or aspecial charcter
import java.util.Scanner;
public class Charcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a any charcter: ");
        char ch = sc.next().charAt(0);
        if((ch>= 65 && ch <=9)||(ch>=97 && ch<= 122)) 
        {
            System.out.println("Alphabet");
        }
        else if ((ch >= 48 && ch <= 57)) {
            System.out.println("Digit");
            
        }
        else {
            System.out.println("Special Charcter");
            }                     

    }
    
}
