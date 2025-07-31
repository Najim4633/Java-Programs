public class StarTriangle {
    public static void main(String[] args) {
        // upStar();
        // downStar();
        // upRight();
        // downRight();
        //pyramidTriangle();
        hollowTriangle();
        
    }
    public static void downStar()
    {
        int n= 5;
        for(int i=n; i>0; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void  upStar()
    {
        int n=5;
        for(int i=0; i<=n;i++)
        {
            for(int j=0; j<=i; j++ )
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void upRight()
    {
         int n=5;
        for(int i=1; i<=n;i++)
        {
            for(int k=i; k<=n; k++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++ )
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void downRight()
    {
        
        int n= 5;
        for(int i=n; i>0; i--)
        {
             for(int k=i; k<=n; k++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
    
public static void pyramidTriangle()
{
      int n=5;
        for(int i=1; i<=n;i++)
        {
            for(int k=i; k<=n; k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++ )
            {
                System.out.print(" *");
            }
            System.out.println();
        }
}
public static void hollowTriangle()
{
    int n=5;
    int i,j,k;
       
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
          
            // inner loop to print spaces.
            for (j = i; j < n; j++) {
                System.out.print("  ");
            }
          
            for (k = 1; k <= ( 2*i - 1); k++) {
                
                // printing stars.
                if (k == 1 || i == n || k == ( 2*i - 1)) {
                    System.out.print(" *");
                }
                
                // printing spaces.
                else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }

    
}
}
