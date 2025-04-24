package linkedList_cap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {
    public static void main(String[] args) {
      
        LinkedList<Integer> l1 = new LinkedList();

       
        l1.add(10);
        l1.add(2);
        l1.add(5);
        l1.add(9);
        
        Collections.sort(l1);
        System.out.println(l1);

       
        l1.addFirst(55);
        l1.addLast(95);
        System.out.println(l1);
        System.out.println("------------------------------------");

        l1.remove(5);
        System.out.println(l1);
        
      
       
        Iterator<Integer> itr = l1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

       
        System.out.println(l1);
        ListIterator<Integer> listIt = l1.listIterator();
        while (listIt.hasNext()) {
            Integer item = listIt.next();
            if (item.equals(9)) {
                listIt.set(11); 
            }
            if (item.equals(10)) {
                listIt.add(100); 
            }
        }

      
        System.out.println("Final list: " + l1);
    }
}
