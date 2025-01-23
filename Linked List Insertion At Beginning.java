class Solution {
    public Node insertAtBegining(Node head, int x) {
        // Code here
        Node newNode=new Node(x);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        return newNode;
    }
}
