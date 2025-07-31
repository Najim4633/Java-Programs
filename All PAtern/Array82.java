public class Array82 {
    
    public static void main(String[] args) {
        int arr[]={16,17,18,15,12,8,10,5,4,6,2,1};
        //findLinearMax(arr);
        findMax(arr, 0);

       
    }
    public static void findMax(int[]arr,int start)
    {
        int indx=start;
        int max=Integer.MIN_VALUE;
            for(int i=indx; i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                    indx=i+1;   
                }
            }
            System.out.println(max);
            if(indx==arr.length) return ;
            findMax(arr, indx);
    }    
    public static void findLinearMax(int[] arr)
    {
         int indx=0;
        while(indx<arr.length){
            int max=Integer.MIN_VALUE;
            for(int i=indx; i<arr.length;i++)
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                    indx=i+1;   
                }
            }
            System.out.println(max); 
        }
    }
}
