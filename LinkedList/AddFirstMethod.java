public class AddFirstMethod {
    public class Node{
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
            System.out.println("LL is empty ");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]){
        AddFirstMethod ll = new AddFirstMethod();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.print();
    }
    
}
