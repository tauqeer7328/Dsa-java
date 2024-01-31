public class LinkedList1{
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
     public static int size=1;
     public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(Head==null){
            Head=tail=newNode;
            return;
        }
        newNode.next=Head;
        Head=newNode;
     }
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
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
    public void add(int idx, int data){
        Node newNode=new Node(data);
        size++;
        Node temp= Head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
     }
     public int Removefirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=Head.data;
            Head=tail=null;
            size=0;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        size--;
        return val;
     }
     public int Removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=Head.data;
            Head=tail=null;
            size=0;
            return val;
        }
        Node prev=Head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
     }
     public static int Search(int key){
        Node temp=Head;
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
     }
     public static int Helper(Node Head, int key){
        if(Head==null){
            return -1;
        }
        if(Head.data==key){
            return 0;
        }
        int idx=Helper(Head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
     }
     public static int recSearch(int key){
        return Helper(Head,key);
     }
     public static void Reverse(){
        Node prev=null;
        Node curr=tail=Head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
     }
     public void DeletedNthFormend(int n){
        int sz=0;
        Node temp=Head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            Head=Head.next;
            return;
        }
        int i=1;
        int isFind=sz-n;
        Node prev=Head;
        while(i<sz-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
     }
    public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(3);
    //ll.Print();
    ll.add(2,9);
    ll.Print();
    ll.Removefirst();
    ll.Print();
    ll.Reverse();
    ll.Print();
    ll.DeletedNthFormend(3);
    ll.Print();
    //ll.Removelast();
    //System.out.println(ll.size);
    //System.out.println(Search(9));
    //System.out.println(recSearch(9));
    }
}