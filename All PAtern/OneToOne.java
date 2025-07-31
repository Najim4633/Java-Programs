import java.util.Arrays;

public class OneToOne {
    public static void main(String[] args) {
        {
            int[] arr = {1,2,3,4};
            int[] arr1= {5,6,7,8};
            int size =arr.length+arr1.length;
            int [] arr2= new int [size];

            for(int i=0,j=0; i<arr2.length; i++)
            {
                if(i<arr.length)
                {
                    arr2[i]=arr[i];
                }
                else
                arr2[i]=arr1[j]++;
            }
            System.out.println(Arrays.toString(arr2));


        }
    }
    
}
