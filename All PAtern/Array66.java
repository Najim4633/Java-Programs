public class Array66 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "banana","apple","cherry"};
        findHighestRepeat(arr);

    } public static void findHighestRepeat(String[] arr)
    {        
        boolean[] b=new boolean[arr.length];
        int max=Integer.MIN_VALUE;
        int maxIndx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(b[i])continue;
            int cnt=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i].compareTo(arr[j])==0)
                {
                    cnt++;
                    b[j]=true;
                }
            }
            if(cnt>max)
            {
                max=cnt;
                maxIndx=i;
            }
        }
        if(max>1)
        System.out.print(arr[maxIndx]);
        else
        System.out.println("no repeating element ");
    }
    
}
