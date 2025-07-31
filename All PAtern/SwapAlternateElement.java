//swapping alternate element in array 
import java.util.Arrays;
public class SwapAlternateElement {
    static void swapAlternateElement(int[] a){

        int j=1;
        while(j<a.length)
        {
            int temp =a[j-1];
            a[j-1]=a[j];
            a[j]=temp;
            j+=2;
        }


    }
    static void uniqueElement(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int size;
        if(arr[arr.length-1]>arr.length+1)
        {
            size=arr[arr.length-1];
        }
        else{
            size=arr.length+1;
        }
        int[] freq= new int[size];
        for(int i =0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0; i<freq.length;i++)
        {
            if(freq[i]==1)
            {
                System.out.println("unique "+i);
            }
        }

    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,1};
        System.out.println(Arrays.toString(arr));
        swapAlternateElement(arr);
        //uniqueElement(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
