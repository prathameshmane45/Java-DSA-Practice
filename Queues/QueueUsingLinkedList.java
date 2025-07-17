public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;


        public static boolean isempty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(isempty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isempty()){
                System.out.println("Queue is empty ");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail = head = null;
            } else{
                head = head.next;
            }
 
            return front;
        }

        public static int peek(){
            if(isempty()){
                System.out.println("Queue is empty ");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while(! q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
