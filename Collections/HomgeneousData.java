import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HomgeneousData {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // ArrayList list =new ArrayList();
        // list.add(10);
        // list.add(true);
        // list.add(10.0);
        // list.add('A');
        // list.add("hello");
        // list.add(50);
        // list.add(false);
        // list.add(70);
        ArrayList list1 =new ArrayList(Arrays.asList(10,true,10.0,'A',"hello",50,false,70));
        System.out.println(list1);

        Iterator obj = list1.iterator();
        while(obj.hasNext())
        {
            if(!(obj.next() instanceof Integer)) obj.remove();
        }
        System.out.println(list1);

    }
}
