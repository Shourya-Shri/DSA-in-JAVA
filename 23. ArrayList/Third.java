//Sorting on ArrayList
import java.util.*;
import java.util.Collections;

public class Third{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(6);
        System.out.println(list);
        Collections.sort(list); //By default Ascending
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        //Comparator-Function me logic inbuilt
        System.out.println(list);
    }
}

//ArrayList (Implementation in java)

/* Internally it implements like array only but due to some different logic it works as dyanamic. It doubles up and earlier gets deleted. */