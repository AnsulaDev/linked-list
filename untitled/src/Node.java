import java.util.*;

class Node {

    int data;
    Node  next;
    Node  prev;
    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class TUF{
    static Node insertAtTail(Node head, int val) {
        Node  new_node = new Node(val);
        if (head == null) {
            head = new_node;
            return head;
        }
        Node  temp = head;
        while (temp . next != null) {
            temp = temp . next;
        }
        temp . next = new_node;
        new_node . prev = temp;
        return head;
    }

    static void display(Node  head) {
        Node  temp = head;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp . next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        Node head=null;
        head = insertAtTail(head,1);
        head = insertAtTail(head,2);
        head = insertAtTail(head,3);
        head = insertAtTail(head,4);
        head = insertAtTail(head,5);
        display(head);

    }
}