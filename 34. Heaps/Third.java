/*
# Introduction to Heaps:-

In java, Visualise-> Heap as Binary Tree(BT)
         Implement-> Array/ArrayList

Properties of heaps:-
1. Binary Tree => At most 2 children

2. Complete Binary Tree =>CBT is a BT in which all the levels are completely filled except possibly the last one, which is filled from left to right.

3.Heap Order Property:- (i) Children>=Parent(minHeap)-Generally we'll use this(By deafault, the PQ is formed in java is by min heap), (ii) Children <= Parent(maxHeap).

# Heap Implementation:-

1. Heap is not implemented as a node class(BT) due to its worst time complexity. Hence, it is implemented as Array or AL.

2. Q) Why heaps is visulise as trees?
==>   Because we want to show parent-child relationship. In AL also it can be shown but only for CBT.

Special Property when we visualise as CBT or heap in the form of Array or ArrayList:-

node(idx)=  i
leftChild=  2i+1
rightChild= 2i+2
*/

//Insert in Heap

import java.util.*;

public class Third {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);
            int x=arr.size()-1;  // x is child node
            int par=(x-1)/2; //par index

            while(arr.get(x)<arr.get(par)){  //O(logn)   //> for descending
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }
        //Peek from Heap
        public int peek(){
            return arr.get(0);
        }
        //Delete in Heap=> Heapify(O(logn))
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){  //arr.get(minIdx)<arr.get(left)=> for descending
                minIdx=left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){  //arr.get(minIdx)<arr.get(right)==>for descending
                minIdx=right;
            }
            if(minIdx!=i){
                //Swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }
        }
        public int remove(){
            int data=arr.get(0);
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.remove(arr.size()-1);

            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){//heap sort==>O(nlogn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
