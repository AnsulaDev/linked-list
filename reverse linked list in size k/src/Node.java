class Node {
    int val;
    Node next;
    Node(int x){
        val = x;
        next = null;
    }

}
class Test {
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next =  new Node(40);
        head.next.next.next.next  = new Node(59);
        head.next.next.next.next.next = new Node(69);
        printList(head);
        System.out.println("reverse node in kth size:");
        head = reverseKth(head,3);
        printList(head);
    }
    static Node reverseKth(Node head, int k){
        Node curr = head;
        Node prevFirst = null;
        boolean isFirstPass = true;
        while(curr != null){
            Node first = curr;
            Node prev = null;
            int count = 0;
            while(curr != null && count<k){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if(isFirstPass){
                head = prev;
                isFirstPass = false;
            }else{
                prevFirst.next =prev;
            }
            prevFirst = first;
        }
        return head;
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val+ " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
