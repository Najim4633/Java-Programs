//wajp replace all vowels with their position with string

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("hello my name is NAjim");
        replace(sb);
        // int[] arr ={1,2,3,4,5,6,7};
        // rotate(arr, 3);
        // System.out.println(Arrays.toString(arr));
    }
    public static void replace(StringBuffer str)
    {
        for(int i=0; i<str.length();i++)
        {
            if(isvowels(str.charAt(i)))
            {
                str.replace(i, i+1, i+"");
            }
            
        }
        System.out.println(str);
    }
    public static  boolean isvowels(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        return true;
        return false;
    }

    public static  void rotate(int[] nums, int k) {
        while(k!=0)
        {
            int temp=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--)
            {            
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
           // System.out.println(Arrays.toString(nums));
            k--;
        }
        
    }

}
