import java.util.HashMap;
import java.util.HashSet;

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
        head.next.next.next.next.next.next = head.next;
        if(isLoop(head)){
            System.out.println("Loop found");
        }
        else{
            System.out.println("no loop found");
        }
        System.out.println("floyd's cycle method:");
        if(floydCycle(head)){
            System.out.println("Loop found");
        }
        else{
            System.out.println("no loop found");
        }


    }
    static boolean  isLoop (Node head){
        HashSet<Node> s = new HashSet<Node>();
        for(Node curr = head; curr !=null; curr=curr.next){
            if(s.contains(curr)){
                return true;
            }
            s.add(curr);
        }
        return false;
    }
    //floyd's cycle method
    static boolean floydCycle(Node head){
        Node slow = head, fast= head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }



}