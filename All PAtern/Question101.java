import java.util.Arrays;

public class Question101 {
    public static void main(String[] args) {
        int [][] arr ={{1,20},{9,19}};
        System.out.println(Arrays.toString(solve(arr[0])));
        

    }
    public static int[] solve(int[] arr)
    {
        int [] ans= new int [2]; 
        for(int ele: arr)
        {
            if(repeting(ele))
            {
                ans[0]+=1;

            }
            else
            ans[1]++;
        }
        System.out.println(Arrays.toString(ans));
        return ans;


    }
    public static boolean repeting(int num)
    {
        int [] arr = new int [6];
        int indx=0;
        while(num>0)
        {
            int rem=num%10;
            arr[indx++]=rem;

        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)continue;
            for(int j =0; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                return  true;
            }
        }
        return false;
    }
    
}
