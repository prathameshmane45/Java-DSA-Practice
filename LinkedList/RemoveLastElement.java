public class RemoveLastElement {
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

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
        
    }

    public static void main(String[] args) {
        RemoveLastElement ll = new RemoveLastElement();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addfirst(6);
        ll.addfirst(7);
        ll.addfirst(8);
        ll.print();
        System.out.println(ll.size);
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}
