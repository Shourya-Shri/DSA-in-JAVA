// Deque (Double ended queue)--> It is an Interface
// To avoid confusion: De queue=> Verb,action,method=> It means to remove an element from queue.

// In Dequeue, we can perform all the operations of normal queue from both sides.

import java.util.*;

public class Tenth {
    public static void main(String args[]){
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2); //21
        deque.addLast(3);  //213
        deque.addLast(4);  //2134
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("First el= "+ deque.getFirst());
        System.out.println("Last el=" + deque.getLast());
    }
}
