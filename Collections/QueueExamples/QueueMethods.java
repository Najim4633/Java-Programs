import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue);
        System.out.println("queue " +queue.add(60));
        
        System.out.println("offer "+queue.offer(70));
        System.err.println(queue);
        
        System.out.println("remove "+queue.remove());
        System.out.println(queue);

        System.out.println("poll "+queue.poll());
        System.out.println(queue);

        System.out.println("element "+queue.element());
        System.out.println(queue);

        System.out.println("peek "+queue.peek());
        System.err.println(queue);

    }
}
