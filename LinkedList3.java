public class LinkedList3{
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
    public  void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public  void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void Print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public Node NthNodeDelete(int position){
          if(head==null){
            System.out.println("LL is empty");
            return null;
          }
        Node temp=head;
        Node prev=null;
        int i=0;
        while(i<position){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=temp.next.next;
        return prev;
    }
    
    public static void main(String args[]){
        LinkedList3 ll=new LinkedList3();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.Print();
        ll.NthNodeDelete(1);
        ll.Print();
    } 
}
        
