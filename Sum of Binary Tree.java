// User function Template for Java

/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        // Your code here
         if(root==null){
            return 0;
        }
        int leftSum=sumBT(root.left);
        int rightSum=sumBT(root.right);
        return leftSum+rightSum+root.data;
    }
}
