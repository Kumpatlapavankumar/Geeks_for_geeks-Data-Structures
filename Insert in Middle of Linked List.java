*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        if(head==null){
            return new Node(x);
        }
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node newnode=new Node(x);
        newnode.next=slow.next;
        slow.next=newnode;
        return head;
    }
}
