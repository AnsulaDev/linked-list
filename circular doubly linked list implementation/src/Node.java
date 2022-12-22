 class Node {
    int val;
    Node next;
    Node prev;
    Node(int x){
        val = x;
        next = null;
        prev = null;
    }
}
class Test{
    public static void main(String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next= temp2;
        head.prev = temp2;
        temp1.prev = head;
        temp2.prev = temp1;
        temp2.next = head;
        printList(head);
        System.out.println("after insertion:");
        head = insertAtHead(head,5);
        printList(head);
    }
    static Node insertAtHead(Node head, int val){
        Node temp = new Node(val);
        if(head ==null){
            temp.next= temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        return temp;
    }
    public static void printList(Node head){
        if(head == null) return;
        Node r = head;
       do{
            System.out.println(r.val + " ");
            r=r.next;
        } while( r != head);
        System.out.println( );
    }
}
