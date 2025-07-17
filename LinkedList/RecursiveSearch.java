public class RecursiveSearch {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"=>");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int recursive(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = recursive(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public static void main(String[] args) {
        RecursiveSearch ll = new RecursiveSearch();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.recursive(head, 10));
    }
}
 