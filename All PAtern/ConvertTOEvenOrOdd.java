//w.a.j.p to convert all element to even or odd base on following condition
//1. if occurance of even number is more then make all elements even
//2. if occurance of odd number is more then make all elements odd
//3. if occurance of even and odd number is same then make all elements even or odd based on first element of array

import java.util.Arrays;

public class ConvertTOEvenOrOdd {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{2,3,4,5},{1,2,3,4,5},{2,3,4,5,6,}};
        for(int[] ele : arr)
        {
            printArray(ele);
            modiefyArray(ele);
            printArray(ele);
            System.out.println("\n ===============================");
        }
      
        
    }
    public static void modiefyArray(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(checkCondition(arr)){
                    if(!even(arr[i]))
                    arr[i]+=1;
                }
            else
                {
                    if(even(arr[i]))
                    arr[i]+=1;
                }
            }
    }
    public static boolean checkCondition(int [] arr)
    {
        int even=0;
        int odd=0;
        for(int ele : arr)
        {
            if(even(ele)) even++;
            else odd++;
        }
        if(even>odd) return true;
        else if(odd>even) return false;
        else 
        {
            return(even(arr[0]));
        }

    }
    public static boolean even(int num)
    {
        return num%2==0;
    }
    public static void printArray(int[] arr)
    {
         System.out.println(Arrays.toString(arr));
    }
    
}
