import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        //unsorted
        System.out.println(linkedList);

        //sorted
        Collections.sort(linkedList);
        System.out.println(linkedList);

        //custom sort
        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println(linkedList);
    }
}
