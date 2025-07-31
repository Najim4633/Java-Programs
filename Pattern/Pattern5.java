// 1
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a range for your pattenrn:  ");
        int range =sc.nextInt();
        int diff;
        int num;
        for (int i = 1; i <= range ; i++) {
            diff= range-1;
            num=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num+=diff;
                diff--;
                }
                System.out.println();
            }
                }



}