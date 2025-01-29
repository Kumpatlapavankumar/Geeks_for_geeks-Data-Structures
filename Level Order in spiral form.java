
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
    // Function to return a list containing the level order
    // traversal in spiral form.
    ArrayList<Integer> findSpiral(Node root) {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(!flag){
                    stack.push(curr.data);
                }else{
                    list.add(curr.data);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(!flag){
                while(!stack.isEmpty()){
                    list.add(stack.pop());
                }
            }
            flag=!flag;
        }
        return list;
    }
}
