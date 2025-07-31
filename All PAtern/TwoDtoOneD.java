import java.util.Arrays;

public class TwoDtoOneD {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));
        int size = sizeOf(arr);
        int[] oned = new int[size];
        int indx=0;
        for(int[] arr1 : arr)
        {
            for(int ele : arr1)
            oned[indx++]= ele;
        }
        System.out.println(Arrays.toString(oned));
    }
    public static int sizeOf(int [][] arr)
    {
        int cnt=0;
        for(int[] arr1: arr)
        {
            for(int ele: arr1)
            {
                cnt++;
            }
        }
        return cnt;
    }
    
}
