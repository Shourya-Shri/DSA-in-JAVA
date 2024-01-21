//Java Collections FrameWork

import java.util.LinkedList;

public class LinkedListtt{
    public static void main(String args[]){
        //crete
        LinkedList<Integer> LL=new LinkedList<>();

        //add
        LL.addLast(1);
        LL.addLast(2);
        LL.addFirst(0);
        //[0,1,2]
        System.out.println(LL);
        //remove
        LL.removeLast();
        LL.removeFirst();
        System.out.println(LL);
    }
}