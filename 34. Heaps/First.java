/*
Introduction to heaps- When we sort data by preference among Queues,then its known as Priority Queue.

# Priority queues in JCF=> Priority Queue<Integer> pq=new PriorityQueue<>();
add and remove=> O(logn) & peek()=> O(1)

Here FIFO doesn't get followed. It is done on priority basis.
 */

import java.util.PriorityQueue;

public class First {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);  //O(logn)
        pq.add(20);
        pq.add(30);
        pq.add(40);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); //O(1)
            pq.remove();
        }
    }
}

//reverseOrder=> It is afunction which reverses the logic
//Comparator=> They are the interfaces in java which defines the logic of the comparisons.

//PriorityQueue<Integer> pq=new PriorityQueue<>(Comapartor.reverseOrder());--->> For descending
