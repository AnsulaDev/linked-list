public class DL {
    Node head;
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val =val;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node=node.next;
        }
        System.out.println("null");
        System.out.println("print in reverse");
        while(last != null){
            System.out.print(last.val + " <- ");
            last=last.prev;
        }
        System.out.println("start");

    }
    public static void main(String args[]){
        DL list = new DL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();




    }

}
