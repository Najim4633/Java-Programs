public class PrimeFactor {
    public static void main(String[] args) {
        int n=15;
        binary(n);
        negativeToBinary(-6);
        
}
public static int binary(int n)
{
    int res=0;
        int bit=0;
        for(int i=0;n>0;i++,n=n>>1)
        {
            bit =n&1;
            res=(bit*pow(10,i))+res;
            
        }
    return res;
         
}
public static void negativeToBinary(int num)
{
    int res=0;
    int n =Math.abs(num);
    int bit=binary(n);
    int compem=~bit;
    res=compem+1;
    System.out.println(res);
}
public static int pow(int n, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return n * pow(n, pow - 1);  // Recursive call
        }
    }

    
}
