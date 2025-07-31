import java.util.Scanner;

public class Question98 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter chapter");
        int ch= sc.nextInt();
        System.out.println("Enter begning day");
        int beg= sc.nextInt();
        System.out.println("Enter end day");
        int end= sc.nextInt();
    
        solve(ch,beg,end);
    
}
public static void solve(int ch, int beg, int end)
{
   
    System.out.println((end-beg)>ch?ch:(end-beg+1));
    
}

}
