import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[]arr)
    {
         int j=arr.length-1;
        for(int i=0;i<=j;i++,j--)
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }

    }
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    
}
