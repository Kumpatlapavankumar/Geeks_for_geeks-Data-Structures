
// User function Template for Java
class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
