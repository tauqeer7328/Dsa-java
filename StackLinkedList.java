public class StackLinkedList {
        static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        static class Stack{
        static Node head=null;
        public static  boolean isEmpty(){
            return head==null;
        }
        //push
        public  void Push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //pop
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head.next=head;
            return top;
        }
    //peek
    public  int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    } 
}
     public static void main(String args[]){
        Stack s= new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop(); 
        }

     }
}
