public class DoublyLinkedList{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public void Print(){
        if(head==null){
            System.out.println("DLL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public  void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public  int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        public Node removeLast(){
            if(head==null || head.next==null){
                System.out.println("DLL is empty");
                return null;
            }
           Node temp= head;
           Node newtail=null;
           while(temp!=null){
             newtail=temp;
             temp=temp.next;
           }
           newtail=newtail.prev;
           newtail.next=null;
           size--;
           return head;
        
        }
    
    public static void main(String args[]){
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.Print();
        System.out.println(dll.size);
        dll.removeLast();
        dll.Print();
        System.out.println(dll.size);
    } 
}
        
