import java.util.Arrays;

public class ProductOfAllElement {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println("product of all element is "+product(arr));
        System.out.println("sum of all element is "+sum(arr));

        
    }
    public static int product(int[] arr)
    {
        int rus =1;
        for(int ele :arr)
        {
            rus *=ele;
            //System.out.println(rus);
        }
        return rus;
    }
     public static int sum(int[] arr)
    {
        int rus=0;
        for(int ele :arr)
        {
            rus +=ele;
            //System.out.println(rus);
        }
        return rus;
    }
    
    
}
