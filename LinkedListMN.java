public class LinkedListMN{
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
    public void SkipMN(int m, int n){
        Node curr=head,t;
        int count;
        while(curr!=null){
            for(count=1;count<m && curr!=null;count++){
                curr=curr.next;
            }
            if(curr==null){
                return;
            }
            t=curr.next;
            for(count=1;count<=n && t!=null;count++){
                Node temp=t;
                t=t.next;
            }
            curr.next=t;
            curr=t;
        }
    }
    
    public static void main(String args[]){
        LinkedListMN ll=new LinkedListMN();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.Print();
        ll.SkipMN(2,2);
        ll.Print();
    } 
}
        
