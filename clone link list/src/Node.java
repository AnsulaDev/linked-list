 class Node {

    int val;
    Node next, random;
    Node(int x){
        val = x;
        next = random = null;
    }

}
class Test{
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(20);

        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        System.out.print( "Original list : \n");
        print(head);

        System.out.print( "\nCloned list : \n");
        Node cloned_list = clone(head);
        print(cloned_list);
    }
    public static Node clone(Node head){
        Node next, temp;

        for(Node curr=head;curr!=null;){
            next = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = next;
            curr=next;
        }
        for(Node curr=head; curr !=null; curr=curr.next.next){
            curr.next.random = (curr.random != null) ? (curr.random.next) : null ;

        }
        Node head2 = head, copy = head.next;
        temp = copy;
        while( head2 != null && copy != null){
            head2.next =  head2.next.next;
            copy.next = copy.next !=null ? copy.next.next: null ;
            copy =copy.next;

        }
        return temp;

    }
    public static void print(Node start)
    {
        Node ptr = start;
        while (ptr!=null)
        {
            System.out.println ( "Data = " + ptr.val + ", Random  = "+ ptr.random.val );
            ptr = ptr.next;
        }
    }

}
