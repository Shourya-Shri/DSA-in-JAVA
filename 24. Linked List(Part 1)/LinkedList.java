public class LinkedList {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    //Size of LL
    public static int size;

    //Add in Linked List
    public void addFirst(int data){

        // Step-1 : create new Node
        Node newNode=new Node(data);
        size++;

        //base case, if node is null
        if(head==null){
            head=tail=newNode;
            return;
        }

        // Step-2 : new Node's next=head
        newNode.next=head;

        // Step-3 : head=newNode
        head=newNode;
    }

    //Add Last in Linked List
    public void addLast(int data){

        //create new node
        Node newNode=new Node(data);
        size++;

        //base case, if LL is null
        if(head==null){
            head=tail=newNode;
            return;
        }
        //tail.next=newNode
        tail.next=newNode;

        //tail=new Node
        tail=newNode;
    }
    //Add in the middle of LL

    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //Remove in a LL

    // (i)-> Remove First
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return -1;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    // (ii)-> Remove Last
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return -1;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        //prev : i =size-2

        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    /*Iterative Search(Loop)
     Search for a key in a LL. Return the position where it is found.If not found, return -1.
    */
    public int itrSearch(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){ //key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //Key not found
        return -1;
    }
    // Recursive Search
    public int RecSearch(int key){
        return helper(head,key);
    }
    //Helper function
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    //Reverse a Linked List--Important(iterative approach)

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev; //because at last current is null so the previous node of null becomes the head.
    }

    //Find & Reverse Nth node from End-{Amazon,Flipkart,Qualemm}
    // nth from end=(size-n+1)th start
    public void deleteNthfromEnd(int n){
        //calculation size

        if(n==size){
            head=head.next; //RemoveFirst
            return;
        }
        //size-n
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i< iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //Print the LinkedList

    public void print(){
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        LinkedList LL=new LinkedList();
        //LL.head=new Node(10);
        //LL.head.next=new Node(20);
        LL.print();
        LL.addFirst(2);
        LL.print();
        LL.addFirst(1);
        LL.print();
        LL.addLast(3);
        LL.print();
        LL.addLast(4);
        LL.print();
        LL.addMiddle(2, 5);
        LL.print();
        System.out.println("Size of LL is " + size);
        //LL.removeFirst();
        LL.print();
        System.out.println("Size of LL is " + size);
        //LL.removeLast();
        LL.print();
        System.out.println("Size of LL is " + size);
        System.out.println(LL.itrSearch(5));
        System.out.println(LL.RecSearch(5));
        LL.reverse();
        LL.print();
        LL.deleteNthfromEnd(2);
        LL.print();
    }

}
