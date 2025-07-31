import java.util.Arrays;

public class FactorialOfArray {
    public static void main(String[] args) {
        {
            int[] arr= {1,2,3,4,5,6,7};
            System.out.println(Arrays.toString(arr));

            for(int i=0; i<arr.length;i++)
            {
                arr[i]=factorialOf(arr[i]);
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int factorialOf(int ele)
    {
        int res=1;
        while(ele>0)
        {
            res*=ele;
            ele--;
        }
        return res;
    }
    
}
