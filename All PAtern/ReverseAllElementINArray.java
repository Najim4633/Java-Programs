//reverse all element in the arary
import java.util.Arrays;
public class ReverseAllElementINArray {
    public static void main(String[] args) {
        int [] arr={23,45,67,22,456,3567,234,987};
        for(int i=0;i<arr.length;i++)
        {
            int temp=reverse(arr[i]);
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int reverse(int num)
    {
        int res=0;
        while(num>0)
        {
            res=res*10+(num%10);
            num/=10;
        }
        return res;
    }
    
}
