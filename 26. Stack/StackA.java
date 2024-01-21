/* Stack Introduction-
Implict Stack- The stack which is created by memory, computer or stack by their own is called implicit stack. Eg:- Recursion, Backtracing.

Explicit Stack- The stack which is created by programmers/coder by their own is called explicit stack.
 # Operations- (i). Push O(1)-> Add from top.
              (ii). Pop O(1)-> Remove top.
             (iii). Peek O(1)-> It gives top.

#Implementation 
i) Using Arrays- As array size is fixed, due to this we don't use array to make stack.
ii) Using ArrayList
iii) LinkedList
*/

// Stack using ArrayList

import java.util.ArrayList;

public class StackA {
    static class Stack{
        static ArrayList<Integer> List=new ArrayList<>();
        public static boolean isEmpty(){
            return List.size()==0;
        }
        //push
        public static void push(int data){
            List.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }
        //peak
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return List.get(List.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
