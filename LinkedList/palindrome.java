public class palindrome {
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

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void printll(){
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

    public Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        Node middle = middle(head);

        Node prev = null;
        Node curr = middle;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right != null ){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        palindrome ll = new palindrome();
        ll.add(1);        
        ll.add(2);        
        ll.add(1);        
        ll.printll();
       System.out.println( ll.isPalindrome());      
    }
}
