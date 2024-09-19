

/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if (head.next == null)
            return null;

        int count = 0;
        Node p1 = head, p2 = head;

        while (p1 != null) {
            count++;
            p1 = p1.next;
        }

        int middleIndex = count / 2;

        for (int i = 0; i < middleIndex - 1; ++i)
            p2 = p2.next;

        p2.next = p2.next.next;
        return head;
    }
}
