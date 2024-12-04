import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        list.add(0, 0);
        list.add(1, 2);
        list.add(2, 5);
        list2.add("Hello");
        list2.add("Tanuj");

        System.out.println(list);
        System.out.println(list2);

        int element = list.get(0);
        String element2 = list2.get(1);
        System.err.println(element);
        System.err.println(element2);

        // add elements in between the array list
        list.add(1, 1);
        list2.add(1, "Mr");
        System.out.println(list);
        System.out.println(list2);

        // change the current element
        list.set(1, 5);
        list2.set(2, "Anmol");
        System.out.println(list);
        System.out.println(list2);

        // size
        int size = list.size();
        int size2 = list2.size();
        System.out.println(size);
        System.out.println(size2);

        Collections.sort(list);
        System.out.println(list);
    }
}
