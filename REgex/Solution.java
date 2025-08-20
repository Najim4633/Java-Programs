public class Solution {
    public static void main(String[] args) {
        // String[] str={"flow","fly","flower"};
        // System.out.println("the biggest prefix of string "+ solve(str));

        int[] arr ={1,1,1,1,3,4,3,3,3,2,5,3,3,5,7,7,2,2,2};
        int i= majorityElement(arr);
        System.out.println(i);
    }

    // private static String solve(String[] words) {
    //     for(int i=0;i<10;i++)
    //     {
    //         for(int j=0;j<words.length-1;j++)
    //         {
    //             if(words[j].charAt(i)!=words[j+1].charAt(i))
    //             {
    //                 return words[j].substring(0,i);
    //             }
    //         }
    //     }
    //     return "";
    // }

    public  static int  majorityElement(int[] nums) {
        int count =0;
        int ele= 0;
        for( int n : nums)
        {
            if(count==0)
            {
                ele=n;
            }
            if(ele==n)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
            return ele;
}
}
