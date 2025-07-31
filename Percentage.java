import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter obtained marks");
        float obmarks = sc.nextInt();
        int totalmarks = 600;
        if(obmarks<0||totalmarks>600){
            System.out.println("invalid marks entered");
            return;
        }



        float percentage = calculatepercentage(obmarks, totalmarks);
        System.out.println("Percentage is "+percentage+"%");
    }
    public static float calculatepercentage(float obmarks, int totalmarks)
    {
        float percentage=obmarks/totalmarks*100;
        return percentage;
    }

    
}
