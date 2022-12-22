class Node {
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class Test{
    static Node insertAtPos(Node head,int pos, int data){
        Node temp = new Node(data);
        if(pos == 1){
            temp.next = head;
            return temp;
        }
        Node curr =head;
        for(int i=1; i<=(pos-2);i++){

        }
    }
}
