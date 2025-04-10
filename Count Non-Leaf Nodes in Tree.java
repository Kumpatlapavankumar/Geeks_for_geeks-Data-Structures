
//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

//function should return the count of total number of non leaf nodes in the tree.
class Solution
{
	int countNonLeafNodes(Node root) {
	    //code here
	     Node curr=root;
       Queue<Node>q=new LinkedList<>();
       q.offer(root);
       int c=0;
       while(!q.isEmpty())
       {
           int n=q.size();
           for(int i=1;i<=n;i++)
           {
               Node t=q.peek();
               q.poll();
               if(t.left!=null||t.right!=null)
               c++;
               if(t.left!=null)
               q.offer(t.left);
               if(t.right!=null)
               q.offer(t.right);
           }
       }
       return c;
	}
}
