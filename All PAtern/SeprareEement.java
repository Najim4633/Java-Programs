import java.util.Arrays;

public class SeprareEement {
    public static void main(String[] args) {
        
            int [] arr ={1,2,0,0,3,4,0,5,6};
           // separatZeos(arr);
            int[] arr1 ={1,2,3,4,5,6,7,8,9};
           // separateOdd(arr1);
            int[]arr2 = {1,-1,2,3,5,-4,6,-7};
            seprateNegative(arr2);

            
    }
    public static void seprateNegative(int[] arr)
    {
         System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++)
            {
                if(arr[i]<0)
                {
                    for(int j=i+1; j<arr.length;j++)
                    {
                        if(arr[j]>0)
                        {
                            int temp=arr[i];
                            arr[i]= arr[j];
                            arr[j]=temp;
                            break;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        
    }
    public static void separateOdd(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++)
            {
                if(arr[i]%2!=0)
                {
                    for(int j=i+1; j<arr.length;j++)
                    {
                        if(arr[j]%2==0)
                        {
                            int temp=arr[i];
                            arr[i]= arr[j];
                            arr[j]=temp;
                            break;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(arr));

    }
    public static void separatZeos(int [] arr)
    {
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++)
            {
                if(arr[i]==0)
                {
                    for(int j=i+1; j<arr.length;j++)
                    {
                        if(arr[j]!=0)
                        {
                            arr[i]=arr[j];
                            arr[j]=0;
                            break;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
    }
    
}
