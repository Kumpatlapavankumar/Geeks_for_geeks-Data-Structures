
class Solution {
    // Function to check whether the list is palindrome.
    static Node reverse(Node head){
        if(head==null){
            return head;
        }
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    static boolean isPalindrome(Node head) {
        // Your code here
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node rev=reverse(slow);
        Node curr=head;
        while(rev!=null){
            if(rev.data!=curr.data){
                return false;
            }
            curr=curr.next;
            rev=rev.next;
        }
        return true;
        
    }
}

