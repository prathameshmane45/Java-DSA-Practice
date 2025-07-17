public class AddMiddle {
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

    public void Middle(int data, int idx){
        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newnNode.next = temp.next;
        temp.next = newnNode;

    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty ");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"=>");
            temp = temp.next;
        }
        System.out.println("null");
    }
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
    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.Middle(6, 0);
        ll.print();
        System.out.println(ll.size);
    }
    
}
