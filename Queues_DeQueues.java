import java.util.*;

public class Queues_DeQueues {
    public static void main(String[] args) {
        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.add(3);
        dequeue.add(6);
        dequeue.add(5);
        dequeue.add(19);
        dequeue.add(1);

        System.out.println(dequeue.removeFirst());
        System.out.println(dequeue.removeLast());
        System.out.println(dequeue);
    }
}
