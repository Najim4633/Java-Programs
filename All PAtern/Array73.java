import java.util.Arrays;
import java.util.Scanner;

public class Array73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of stock  ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter stocks");
        for(int i=0; i<n; i++ )
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter lucky num");
        int k= sc.nextInt();
        sortArray(arr);
        System.out.println(arr[k-1]);
    }
    public static void sortArray(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    
    }
    
}
