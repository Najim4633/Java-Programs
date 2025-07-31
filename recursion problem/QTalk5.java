public class QTalk5 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,10};
        System.out.println(solve(arr));
                
    }
    private static int solve(int[] arr) {
        int sum=0;
        for(int i=1; i<arr.length;i+=2)
            if(isPrime(arr[i]))
                sum+=arr[i];
        return sum;
    }
    public static boolean isPrime(int num)
    {
        if(num<2)return false;
        for(int i=2; i<=num/2;i++)
            if(num%i==0) return false;
        return true;
    }
}
