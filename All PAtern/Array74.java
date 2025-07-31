import java.util.Scanner;

public class Array74 {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter number of item");
            int n=sc.nextInt();
            System.out.println("enter k intial dollars");
            int k=sc.nextInt();
            int[] cost = new int[n];
            System.out.println("Enter cost price ");
            for(int i=0;i<n;i++)
            {
                cost[i]=sc.nextInt();
            }
            int[] sell = new int[n];
            System.out.println("enter selling price");
            for(int i=0;i<n;i++)
            {
                sell[i]=sc.nextInt();
            }
            System.out.println();
            int profit =findProfit(cost, sell, n,k);
            System.out.println("profit of salesman is "+profit);

        
    }
    public static int findProfit(int[]cost,int[]sell,int n,int k)
    {
        // sort
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
                if (cost[i] > cost[j]) {
                    // Swap cost
                    int temp = cost[i];
                    cost[i] = cost[j];
                    cost[j] = temp;

                    // swapp sell
                    temp = sell[i];
                    sell[i] = sell[j];
                    sell[j] = temp;
                }
            }
        }

        int profit = 0;

        for (int i = 0; i < n; i++) {
            if (sell[i] > cost[i] && k >= cost[i]) {
                k -= cost[i];
                k += sell[i];
                profit += (sell[i] - cost[i]);
            }
        }

        return profit;

    }
    
}
