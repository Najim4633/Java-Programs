import java.util.Scanner;
public class Password {
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        int storedPIn =1234;
        int duration =5000;
        outerloop:
        for(;;)
        {
            int attempt = 3;
            do{
                System.out.println("Enter your password: ");
                int userpin =sc.nextInt();
                if(userpin==storedPIn)
                {
                    System.out.println("phone unlockced");
                    break outerloop;        
                }
                else{
                    System.out.println("wrong pin enterd");
                    System.out.println("attempt left: "+ (attempt-1));
                }
                attempt--;
            }while(attempt>=1);
            System.out.println( "duration remaining "+(duration/1000)+"seconds");
            Thread.sleep(duration);
            duration*=2;
        }        
    }
    
}
