import java.util.Arrays;

public class SortingTechnique {
    public static void main(String[] args) {
        // int[] arr={5,4,3,2,1,0};
        // int[] arr2={1,2,3,4,5,6};
        String[] arr={"d","a","b","c"};
        String[] arr2={"d","a","b","c"};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
         System.out.println("BubbleSort : "+Arrays.toString(arr.clone()));
        selectionSort(arr);
        System.out.println("Selection Sort : "+Arrays.toString(arr.clone()));
        insertionSort(arr);
         System.out.println("Insertion Sort : "+Arrays.toString(arr.clone()));

         descInsertion(arr2);
         System.out.println("desc Insertion Sort : "+Arrays.toString(arr2.clone()));
        descSelectiom(arr2);
        System.out.println("Selection desc Sort : "+Arrays.toString(arr2.clone()));
        descBubble(arr2);
        System.out.println("Bubble desc Sort : "+Arrays.toString(arr2.clone()));

        
    }
    public static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            int minindx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minindx]) minindx=j;
            }
            int temp=arr[minindx];
            arr[minindx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int prev=i-1;
            int key=arr[i];
            while(prev>=0 && arr[prev]>key)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=key;
        }
    }
    //decending order methods
    private static void descBubble(int[] arr )
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    private static void descSelectiom(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int maxI=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[maxI]) maxI=j;
            }
            int temp= arr[i];
            arr[i]=arr[maxI];
            arr[maxI]=temp;
        }
    }
    private static void descInsertion(int [] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int prev=i-1;
            int key=arr[i];
            while(prev>=0 && arr[prev]<key)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=key;
        }
    }
public static void bubbleSort(String[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(String[] arr)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            int minindx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j].compareTo(arr[minindx])<0) minindx=j;
            }
            String temp=arr[minindx];
            arr[minindx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionSort(String[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int prev=i-1;
            String key=arr[i];
            while(prev>=0 && arr[prev].compareTo(key)>0 )
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=key;
        }
    }
    //decending order methods
    private static void descBubble(String[] arr )
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])<0)
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    private static void descSelectiom(String[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int maxI=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j].compareTo(arr[maxI])>0) maxI=j;
            }
            String temp= arr[i];
            arr[i]=arr[maxI];
            arr[maxI]=temp;
        }
    }
    private static void descInsertion(String [] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int prev=i-1;
            String key=arr[i];
            while(prev>=0 && arr[prev].compareTo(key)<0)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=key;
        }
    }
    

    
}

