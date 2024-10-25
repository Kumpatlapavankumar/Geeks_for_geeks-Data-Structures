
/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        Node temp = head;
        int count = 0;
        Node newNode = new Node(x);
        
        if(p==0){
            Node front = temp.next;
            newNode.prev = temp;
            newNode.next = front;
            temp.next = newNode;
            front.prev = newNode;
            return head;
        }
        while(temp.next != null){
            temp = temp.next;
            count++;
            if(count== p){
                break;
            }
        }
        
        Node front = temp.next;
        if(front == null){
            newNode.next = null;
            newNode.prev = temp;
            temp.next = newNode;
            return head;
        }
        
        newNode.prev = temp;
        newNode.next = front;
        front.prev = newNode;
        temp.next = newNode;
        return head;
        
    }
}
