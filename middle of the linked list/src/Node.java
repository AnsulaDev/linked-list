class Node {
    int val;
    Node next;
    Node(int x){
        val = x;
        next =null;
    }
}
class Test{
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = sortedInsert(head,25);
        printList(head);
    }
    static Node sortedInsert(Node head, int x){
        Node temp = new Node(x);
        if(head == null) return temp;
        if(x<head.val){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while( curr.next != null && curr.next.val <x){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;

    }
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val+ " ");
            curr=curr.next;
        }

        System.out.println();
    }

}
