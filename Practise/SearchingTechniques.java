public class SearchingTechniques {
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,4,5,6,7,8,9,10};
        // System.out.println(linearSearch(arr, 9));
        // System.out.println(binarySearch(arr,4));
        System.out.println(turnarySearch(arr, 6));
    }
    private static int linearSearch(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target) return i;
        }
        return -1;
    }
    private static int binarySearch(int arr[], int target)
    {   
        int start=0;
        int end=(arr.length-1);
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            System.out.println(start+" "+mid+" "+end+" "+arr[mid]);
        }
        return -1;

    }
    public static int turnarySearch(int arr[],int target)
    {
        int start=0, end=arr.length-1;
        while(start<=end)
        {
            int mid1=start+(end-start)/3;
            int mid2=start+(end-start)*(2/3);
            if(target==arr[mid2])return mid2;
            else if(target<arr[mid2])
            {
                if(target ==arr[mid1])return mid1;
                else if(target<arr[mid1]) end=mid1-1;
                else start=mid1+1;
            }else{
                start=mid2+1;
            }

        }
        return -1;
    }
}
