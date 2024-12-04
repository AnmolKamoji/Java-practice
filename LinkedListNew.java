import java.util.*;

public class LinkedListNew {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();

        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(16);
        l1.add(20);
        l1.add(21);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(16));

        l1.set(1, 566);
        for (int i = 0; i < l1.size(); i++) {
            System.err.print(l1.get(i));
            System.err.print(", ");
        }
    }
}
