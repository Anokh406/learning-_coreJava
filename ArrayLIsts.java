import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLIsts {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add elements in list
        list.add(0, 5);
        list.add(1);
        list.add(2);
        list.add(3);
        // System.out.println(list);

        // // get elements into list
        // int elements = list.get(0);
        // System.out.println(elements);
        // set elements into list
        // list.set(0, 10);
        // System.out.println(list);
        // delete elements from list
        // list.remove(0);
        // System.out.println(list);
        // size of list
        // int size = list.size();
        // System.out.println(size);
        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        // sorting in list
        Collections.sort(list);
        System.out.println(list);
    }
}
