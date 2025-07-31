public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr ={1,5,1,3,1,5,1,6,133,24,78};
        //findFrequency(arr);
        // findDistinct(arr);
        //findUnique(arr);
    }
    public static void findFrequency(int[] arr)
    {
        boolean[] b=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(b[i])continue;
            int cnt=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                    b[j]=true;
                }
            }
            System.out.println(arr[i]+" : "+cnt);
        }
    }
    public static void findUnique(int[] arr)
    {
        boolean[] b=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(b[i])continue;
            int cnt=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                    b[j]=true;
                }
            }
            if(cnt==1)
            System.out.println(arr[i]);
        }
    }


    public static void findDistinct(int[] arr)
    {
        boolean[] b=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(b[i])continue;
            int cnt=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                    b[j]=true;
                }
            }
            if(cnt>0)
            System.out.println(arr[i]);
        }
    }

}
