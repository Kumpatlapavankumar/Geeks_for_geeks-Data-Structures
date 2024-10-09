class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int nodes=1;
        while(head.next!=null){
            nodes++;
            head=head.next;
        }
        return nodes;
    }
}
