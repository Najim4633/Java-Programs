import java.util.Arrays;

public class QTalk1 {
    public static void main(String[] args) {
        // int [] distance ={50,55,60};
        // int [] target= {60,55,50,65};
        int [] distance ={2};
        int [] target= {8,4,3,10,6};
        int[] arr =solve(distance,target);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] solve(int[] distance, int[] target) {
        int count=0;
        int[] arr=new int[target.length];
        for(int i=0;i<target.length;i++)
        {
            int sum=0;
            for(int j=0; j<distance.length;j++)
            {
                sum+=(Math.abs(target[i]-distance[j]));
            }
            arr[count++]=sum;
        }
        return arr;
        
    }
    
}
