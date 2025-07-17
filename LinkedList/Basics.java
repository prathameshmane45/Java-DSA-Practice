// import java.util.*;
public class Basics{
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


    // Adding Element in the linked list at first position 
    public void Addfirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // printing Linked list 
    public void printll(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Basics ll = new Basics();
        ll.Addfirst(4);
        ll.Addfirst(5);
        ll.printll();
        
    }
}