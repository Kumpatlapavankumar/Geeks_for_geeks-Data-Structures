class Solution {
    //donot edit this code
    int getMiddle(Node head) {
        // Your code here.
        if(head==null || head.next==null){
            return head.data;
        }
        if(head.next.next==null){
            return head.next.data;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
}
