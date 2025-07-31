import java.util.Arrays;
class Solution {
    public static int[][] generate(int numRows) {
        int[][] arr= new int[numRows][];
        for(int i=0; i<numRows; i++)
        {
            arr[i]=new int [i+1];
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i){
                    arr[i][j]=1;
                   // System.out.print(1);
                }
                else
                    {arr[i][j]=arr[i-1][j-1]+arr[i-1][j];}
                    System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        return arr;
    
        
    }
   
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(generate(10)));


    }
}
