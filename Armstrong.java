//wajp to find armstrong number 
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int length = iscount(num);
        int sum=pow(num,length);
        System.out.println(sum);
        System.out.println((sum==num?true:false));
        }
    public static int iscount(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        return count;
    }
    public static int pow(int num, int length)
    {
        int sum=0;
        while(num>0){
             int pow=1;
            for(int i=1; i<=length; i++){
                 int rem=num%10;
                 pow*=rem;
            }
            sum+=pow;
            num/=10;

        }
        return sum;
        
    }
    
}
