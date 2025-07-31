import java.util.ArrayList;
import java.util.Scanner;

public class Leetcode17 {

    public static void main(String[] args) {
        String[] str={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        ArrayList<String> list=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter digit");
        // String digit =sc.nextLine();
        int digit1=sc.nextInt();
        int digit2=sc.nextInt();

        for(int i=0; i<str[digit1].length();i++)
        {
            for(int j=0;j<str[digit2].length();j++)
            {
                String op =str[digit1].charAt(i)+"";
                op+=str[digit2].charAt(j)+"";
                list.add(op);
                // break;
            }

        }
        System.out.println(list);
        

        
    }

}