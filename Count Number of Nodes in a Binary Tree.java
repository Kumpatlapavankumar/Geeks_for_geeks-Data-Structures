// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
