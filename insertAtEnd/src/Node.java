 class Node {
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;

    }
}
class Test{
    public static Node insertAtEnd(Node head ,int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        Node curr = head;
        while(curr.next  != null){
            curr=curr.next;
        }
        curr.next = temp;
        return head;

    }
    public static void main(String args[]){
        Node head = null;
        head=insertAtEnd(head,10);
        head=insertAtEnd(head,20);
        head=insertAtEnd(head,30);
        head=insertAtEnd(head,40);
        printList(head);
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr!= null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
