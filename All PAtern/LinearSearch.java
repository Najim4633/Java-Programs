public class LinearSearch {
    public static boolean binarySearch(int [] arr, int key)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(key==arr[i]) return true;
        }
        return false;

    } 
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5,6,7,8};
        int key =0;
        System.out.println((binarySearch(arr, key))?"present":"not present");
    }
    
}
