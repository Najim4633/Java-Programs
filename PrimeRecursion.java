import java.util.Scanner;
public class PrimeRecursion {
    static int count=0;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();
        int count = factors(num,1);
        System.out.println(count==1?"prime":"not prime");

    }
    public static int factors(int num, int i)
    {
        if(num<2)
            return 0;
        if(num%i++==0)
            count++;
        if(i==num)
            return count;
        return factors(num, i);

    }
}
