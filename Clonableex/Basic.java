import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("list1 "+list1);
        ArrayList<Integer> list2 =(ArrayList<Integer>)list1.clone();
        System.out.println("cloned "+ list2);
        ArrayList<Integer>list3=list1;
        System.out.println(list1==list2);
        System.out.println(list1==list3);

        System.out.println("================================");
        list1.set(1,200000);
        System.out.println("list1 original "+list1);
        System.out.println("list2 cloned "+list2);
        System.out.println("list3 cloned assignment operator "+list3);

        System.out.println("================================");
        list1.add(200000);
        System.out.println("list1 original "+list1);
        System.out.println("list2 cloned "+list2);
        System.out.println("list3 cloned assignment operator "+list3);

   }
}
