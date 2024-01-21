import java.util.*;

public class Third {
    public static void main(String args[]){
        //Stack creation
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek()); //3 2 1
            s.pop();
        }
    }
}
