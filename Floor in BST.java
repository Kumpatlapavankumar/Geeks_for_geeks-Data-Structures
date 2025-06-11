// User function Template for Java
//donot edit this code
class Solution {
    public static int floor(Node root, int x) {
        // Code here
        Node temp=null;
        if(root==null){
            return 0;
        }
        while(root!=null){
            if(root.data==x){
                return x;
            }else if(root.data>x){
                root=root.left;
            }else{
                temp=root;
                root=root.right;
            }
        }
        if(temp==null){
            return -1;
        }else{
            return temp.data;
        }
    }
}
