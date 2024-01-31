public class LinkedList{
    public static class Node{
        int data;
        Node next;

     public Node(int data){
        this.data=data;
        this.next=null;
     }
    }
     public static Node Head;
     public static Node tail;
     public void addFirst(int data){
        Node newNode= new Node(data);
        if(Head==null){
            Head=tail=newNode;
            return;
        }
        newNode.next=Head;
        Head=newNode;
     }
    public void addLast(int data){
        Node newNode= new Node(data);
        if(Head==null){
            tail=Head=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
     }
     public void Print(){
        if(Head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void RemoveLoop(Node Head){
        Node slow=Head;
        Node fast=Head;
        boolean Cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                Cycle=true;
                break;
            }
        }
        if(Cycle==false){
            return;
        }
        slow=Head;
        Node Prev=null;
        while(fast!=slow){
            Prev=fast;
            slow = slow.next;
            fast=fast.next;
        }
        Prev.next=null;
    }
    public static void main(String[] args) {
    Head=new Node(1);
    Head.next=new Node(2);
    Head.next.next=new Node(3);
    Head.next.next.next=Head.next.next;
    Head.next.next.next.next=new Node(5);
    RemoveLoop(Head);
l   System.out.println();

    }
}