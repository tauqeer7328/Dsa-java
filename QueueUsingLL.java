public class QueueUsingLL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;n
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
                tail.next=newNode;
                tail=newNode;
        }
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=head.data;
            if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
            }
            return front;
        }
        public int Peek(){
           if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
           }
           return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        while(!q.isEmpty()){
            System.out.println(q.Peek());
            q.remove();
        }
     }
    
}