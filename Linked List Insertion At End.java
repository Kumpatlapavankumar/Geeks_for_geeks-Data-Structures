class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode=new Node(x);
        if(head==null){
            return newNode;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return  head;
    }
}
