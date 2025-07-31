import java.util.*;

public class StringTOCharArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a String  ");
        String str=sc.nextLine();
        System.out.println(Arrays.toString(toCharArr(str)));
        //findFrequency(str);
        //findDistinct(str);
        //findFirstUnique(str);
        //findRepeat(str);
        //findHighestRepeat(str);
    }
    public static char[] toCharArr(String str)
    {
        char[] ch =new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i);
        }
        return ch;
    }
    public static void findFrequency(String str)
    {   
        char [] arr=toCharArr(str);
        System.out.println("\n Frequency of Element of element of String");
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
            System.out.print(arr[i]+" : "+cnt+"; ");
        }
    }
    public static void findFirstUnique(String str)
    {
         char [] arr=toCharArr(str);
        boolean[] b=new boolean[arr.length];
        boolean flag=false;
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
             {
                flag=true;
                System.out.println("\n first Unique element of String");
                System.out.print(arr[i]);
                break;
             } 
        }
        if(!flag)
            System.out.println("\n Element not found");
    }


    public static void findDistinct(String str)
    {
         char [] arr=toCharArr(str);
        String str1="";
        boolean[] b=new boolean[arr.length];
        System.out.println("\n Distinct element of String");
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
            
            str1+=arr[i];
        }
        System.out.println(str1);
    }
    public static void findRepeat(String str)
    {
        char [] arr=toCharArr(str);
        System.out.println("\n repeating element of String");
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
            if(cnt>1)
            System.out.print(arr[i]);
        }
    }
    public static void findHighestRepeat(String str)
    {
        char [] arr=toCharArr(str);
        System.out.println("\n highest repeating element of String");
        boolean[] b=new boolean[arr.length];
        int max=Integer.MIN_VALUE;
        int maxIndx=0;
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
