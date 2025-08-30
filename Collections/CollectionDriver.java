import java.util.*;
class CollectionsMEthod{

}
public class CollectionDriver {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,80));
        System.out.println("Original List : "+list);
        System.out.println("min ele : " +Collections.min(list));
        System.out.println("max ele : "+Collections.max(list));

        
        Collections.swap(list, 3, 5);
        System.out.println("After swap ele  "+list);
        
        Collections.reverse(list);
        System.out.println("After reverse "+list);

        
        Collections.rotate(list, 3);
        System.out.println("rotate method() : "+list);

        
        Collections.shuffle(list);
        System.out.println("list after shuffle "+list );
        
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        Collections.copy(list, list2);
        System.out.println("list 2 after copy "+list2);
        System.out.println(list);
        
        Collections.replaceAll(list, 40, 4);
        System.out.println("replace all 40 as 4 "+ list );
        
        Integer val =10;
        Collections.fill(list, val);
        System.out.println("after fill ele "+list);
    }
    
}
