public class Number {
    public static void main(String[] args) {
        int n=5;
        int i,j,k,l,m;
        for( i =n;i>=1; i--)
        {
            for(j =1; j<=i; j++)
            {
                System.out.print(" "+j);
            }
            for( k =i+1; k<=n;k++)
            {
                System.out.print(" * *");
            }
            // for( k =j; k<=n;k++)
            // {
            //     System.out.print(" *");
            // }
            for(l=i ;l>=1;l--)
            {
                System.out.print(" "+l);
            }
            System.out.println("");
        }
    }
    
}
