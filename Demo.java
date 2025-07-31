import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = sc.nextInt();
        int a= n/10;
        int b= n%10;

         if ((a+b)+(a*b) == n) {
            System.out.println("special num");
         }
            else
            System.out.println("not special");
     
        
            
        
        
    }

    
}