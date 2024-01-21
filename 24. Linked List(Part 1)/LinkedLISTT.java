//Check if LL is a Palindrome.
/* (i) Find midNode
  (ii) 2nd half Node
 (iii) Check is 1st == 2nd half 
 */

public class LinkedLISTT {
    
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
    //Slow-fast Approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow; //Slow is any midValue
    }
    //Check Palindrome
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step-1 =Find mid;
        Node midNode=findMid(head);

        //step-2 =Reverse 2nd half

        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; //right half head
        Node left=head; //left half head

        //Step-3=> Check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
        LinkedLISTT LL=new LinkedLISTT();
        LL.addLast(1);
        LL.addLast(3);
        LL.addLast(1);
        LL.print();
        System.out.println(LL.checkPalindrome());
    }

}
