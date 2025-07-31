import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr ={1,2,3,6,4,2};
        System.out.println("before : "+ Arrays.toString(arr) );
        //selectionSortDesc(arr);
        selectionSortAscRecusion(arr, 0);
        System.out.println("After : "+ Arrays.toString(arr) );
        //selectionSortAsc(arr);
        //System.out.println("After : "+ Arrays.toString(arr) );

    }
    public static void selectionSortDesc(int[] arr)
    {
        for(int i =0; i<arr.length; i++)
        {
            int min=i;
            for(int j= i+1;j<arr.length;j++)
            {
                if(arr[min]<arr[j])
                {
                    min=j;
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]= temp;

        }
    }
    public static void selectionSortAsc(int[] arr)
    {
        for(int i =0; i<arr.length; i++)
        {
            int max=i;
            for(int j= i+1;j<arr.length;j++)
            {
                if(arr[max]>arr[j])
                {
                    max=j;
                }
            }
            int temp =arr[max];
            arr[max]=arr[i];
            arr[i]= temp;

        }
    }
    public static void selectionSortAscRecusion(int[] arr, int i)
    {
        //selection sort by using recursion
        int max=i;
            for(int j= i+1;j<arr.length;j++)
            {
                if(arr[max]>arr[j])
                {
                    max=j;
                }
            }
            int temp =arr[max];
            arr[max]=arr[i];
            arr[i]= temp;
            if(i>=arr.length-2)return;
            selectionSortAscRecusion(arr,i);


    }
}
