//User function Template for Java
//donot edit this code 
/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    public static int findMax(Node root){
        //code here
        if(root==null){
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int result=root.data;
        while(!q.isEmpty()){
            Node temp=q.poll();
            result=Math.max(result,temp.data);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        return result;
        
    }
    public static int findMin(Node root){
        //code here
         if(root==null){
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int result=root.data;
        while(!q.isEmpty()){
            Node temp=q.poll();
            result=Math.min(result,temp.data);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        return result;
    }
}
