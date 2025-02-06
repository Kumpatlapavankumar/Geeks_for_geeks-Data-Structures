
/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node n1, Node n2) {
        // write your code here
        while(n1!=null){
            if(n1.data!=n2.data) return false;
            n1=n1.next;
            n2=n2.next;
        }
        return true;
    }
}
