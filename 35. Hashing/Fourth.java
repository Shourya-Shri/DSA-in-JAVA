//==> Special Note-> In hashMap, time complexity for a single operation can go upto O(n), when all the node are in the same bucket and you have to find the last node of that bucket.
//==> In hashMap, time complexity for a single operation can go upto O(1), when all the node are in different buckets.

// Linked HashMap-> Keys are inserted in order.It helps in maintaining the order of insertion.
//Operations--> put,get,remove,size,isEmpty,keySet(), Same tc.

//In LHM, the internal implementation gets changed, the nodes at each buckets becomes doubly linked list.
import java.util.LinkedHashMap;
import java.util.HashMap;

public class Fourth {
    public static void main(String args[]){

        LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("US",50);

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);

        System.out.println(hm);
        System.out.println(lhm);
    }
}
