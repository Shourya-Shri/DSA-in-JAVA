/*
# Implementation HashMap:-
=> It gets implemented in the form of, Array of LL.Here, this array is know as bucket.
=> For each bucket, it has its own Linked List.
-> To check whether key exists or not, we can use the brute force approach:- 

a) By going on every node, but that will not be optimised.
b) We can use the hash function to get the index of the bucket.

Rehashing:- This process is of O(n).
For different array there will be different bucket index.

*/

import java.util.*;

public class Third {
    static class HashMap<K,V>{  //(K,V is generic here means it means the value type of key and value is not defined and it can be anything)
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;  //n=Total nodes
        private int N;
        private LinkedList<Node> buckets[]; //N=> buckets of type LinkedList of Nodes

        @SuppressWarnings("unchecked") //because in some versions of java, java will not llow to create LinkedList directly, rather it will ask the type of LinkedList. So to prevent that we use supress warning.
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4]; //It means we got an array of size 4 where we can store data in the form of Linked List.
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc=key.hashCode(); //1234567;-1234567 Return a hashcode value
            return Math.abs(hc)%N;
        }
        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;  //data index

            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            //nodes-> add in bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll=oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key, V value){ //O(lambda)
            int bi=hashFunction(key);
            int di=SearchInLL(key,bi);

            if(di!=-1){
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda=n/N;
            if(lambda>=2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=SearchInLL(key,bi); //valid;-1

            if(di!=-1){//valid
                return true;
            }
            else{//invalid
                return false;
            }
        }
        public V remove(K key){
            int bi=hashFunction(key);
            int di=SearchInLL(key,bi); //valid;-1

            if(di!=-1){
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }
        public V get(K key){ //O)1
            int bi=hashFunction(key);
            int di=SearchInLL(key,bi); //valid;-1

            if(di!=-1){
                Node node=buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<K>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String args[]){

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);

        ArrayList<String> keys=hm.keySet();
        for(String key:keys){
            System.out.println(key);
        }
    }
}
