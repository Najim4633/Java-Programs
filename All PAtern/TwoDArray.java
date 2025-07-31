public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,},{4,5,6,7},{8,9,10}};
        forLoop(arr);
        foreachLoop(arr);
        doWhileLoop(arr);
        whileLoop(arr);

        
    }
    //printing 2d array by using for loop
    public static void forLoop(int[][] arr)
    {
        System.out.println("//printing 2d array by using for loop");
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
    //by using foreach loop printing 2d array
    public static void foreachLoop(int[][] arr)
    {
        System.out.println("//by using foreach loop printing 2d array");
        for(int[] ele : arr)
        {
            for(int ele1 : ele)
            {
                System.out.print(ele1+" ");
            }
            System.out.println();
        }

    }
    //by using while loop
    public static void whileLoop(int[][] arr)
    {
        System.err.println("//by using while loop");
        int i=0;
        while( i<arr.length)
        {
            int j=0;
            while( j<arr[i].length)
            {
                System.out.print(arr[i][j]+" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    // by using do while loop
    public static void doWhileLoop(int[][] arr)
    {
        System.out.println("// by using do while loop");
        int i=0;
        do
        {
            int j=0;
            do
            {
                System.out.print(arr[i][j]+ " ");
                j++;
            }while( j<arr[i].length);
            i++;
            System.out.println();
        }while( i<arr.length);
    }
}
