import java.util.Arrays;
public class MissingAndReapeted {
    public static void main(String[] args) {
       int[] arr = {4,3,6,4, 4, 3, 2,1,1,13};
    //    Arrays.sort(arr);
        int[] freq = new int[arr[arr.length-1]+1];
       System.out.println(freq.length);
       int reap =0;
       int missing=0;
       System.out.println(Arrays.toString(arr));
       for(int i=0; i<arr.length;i++)
       {
        freq[arr[i]]++;
            

       }
       System.out.println(Arrays.toString(freq));
       for(int i=0; i<freq.length;i++)
       {
            if(freq[i]==0)
            {
                missing=i;
                System.out.println("missing "+missing);
            }
            else if(freq[i]>1){
                reap=i;
                System.out.println(" reapet "+reap);   
            }
            else {
                System.out.println("single "+i);
            }
       }


    }
    
}
