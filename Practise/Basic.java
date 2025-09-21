public class Basic {
    public static void main(String[] args) {
      
    //    System.out.println(isPalindrom(121));
    //    System.out.println(reverseNum(12345));
        // swapWithTemp();
        // swapWithOutTemp();
        //System.out.println(factorial(5));
        // System.out.println(recursiveFact(5));
        // System.err.println(isPrime(4)?"prime":"not prime ");
        // System.out.println(isArmStrong(153));
        // fibonacci(10);
        System.out.println(fibonacciRecursive(10));
    }  
     
    public static boolean isPalindrom(int num)
    {
        int rev=0;
       for(int i=num;i!=0;i/=10)
       {
            rev=rev*10+(i%10);
       } 
        return (rev==num)?true:false ;
    }
    public static int reverseNum(int num)
    {
        int rev=0;
       for(int i=num;i!=0;i/=10)
       {
            rev=rev*10+(i%10);
       } 
       return rev;
    }
    public static void swapWithTemp()
    {
        int a=20,b=10;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" : "+b);

    }
    public static void swapWithOutTemp()
    {
        int a=20,b=10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+ " : "+b);
    }
    public static String evenOdd(int num)   
    {
        return (num%2==0)?"Even":"odd";
    }
    public static int factorial(int n)
    {
        int res=1;
        while(n!=0)
        {
            res*=n;
            n--;
        }
        return res;
    }
    public static int recursiveFact(int num)
    {
        
        if(num <=1) return 1;
        return num*recursiveFact(num-1);
    }
    public static boolean isPrime(int num)
    {
        if(num<2) return false;
        for(int i=2; i<=num/2;i++)
        {
            if(num%i==0) return false;
        }
        return true;
    }
    public static boolean isArmStrong(int num)
    {
        int temp=num;
        int count=0;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }
        temp=num;
        int res=0;
        while(temp!=0)
        {
            int rem=temp%10;
            res+=power(rem, count);
            temp/=10;
        }
        System.out.println(res+" "+num);
        return res==num;
    }
    public static int power(int num, int pow)
    {
        int res=1;
        while(pow!=0)
        {
            res*=num;
            pow--;
        }
        System.out.println("power "+res);
        return res;
    }
    public static void fibonacci(int num)
    {
        int prev=0;
        int prev1=1;
        int res=0;
        System.out.println(0+ " : "+prev);
        for(int i=1;i<=num;i++)
        {
            res=prev+prev1;
            prev=prev1;
            prev1=res;
            System.out.println(i+" : "+res);
        }
    }
    public static int fibonacciRecursive(int num)
    {
        if(num==0)return 0;
        if(num==1) return 1;
        return fibonacciRecursive(num-2)+fibonacciRecursive(num-1);
    } 
    
}

