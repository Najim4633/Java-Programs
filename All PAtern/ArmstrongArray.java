// import java.util.*;
public class ArmstrongArray {
    public static void main(String[] args) {
        int[] arr = {1,3,45,6,153,370};
        for(int ele : arr)
        {
            if(isArmstrong(ele))
            {
                System.out.print(" "+ele);
            }
        }
    }
    public static boolean isArmstrong(int ele)
    {
       int  power = findLength(ele);
       int res=0;

       for(int i=ele;i!=0;i/=10)
       {
        res+=findpower(i%10,power);
       }
       return res==ele;

    }
    public static int findpower(int ele, int power)
    {
        int res= 1;
        for(;power>0; power--)
        {
            res*=ele;
        }
        return res;

    }
    public static int findLength(int num)
    {
        int cnt=0;
        while(num>0)
        {
            num/=10;
            cnt ++;
        }
        return cnt;
    }
}
