//Queue using Java collections Frameworks(JCF)
/* In JCF, a Queue is not a class rather it is an interface and we can never create objects of Interface. That's why we make classes of those which can implement Queue.
 
 * Two classes implement Queue in java- (i) Linked List and (ii) ArrayDeque because it can't have it's own objects.
 */

import java.util.*;   //O(1)

public class Fourth {
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();  //ArrayDeque can also be used

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
