
/*Complete the given function
Node is as follows:
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null){
            return list;
        }
        
        q.add(root);
        list.add(root.data);
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.left != null){
                q.add(curr.left);
                list.add(curr.left.data);
            }else{
                list.add(-1);
            }
            if(curr.right != null){
                q.add(curr.right);
                list.add(curr.right.data);
            }else{
                list.add(-1);
            }
        }
        //System.out.println(list);
        return list;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> list) {
        // code here
        if(list.isEmpty()){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        int i=0;
        Node root = new Node(list.get(i));
        i++;
        q.add(root);
        
        while(i < list.size()){
            Node curr = q.poll();
            if(list.get(i) != -1){
                curr.left = new Node(list.get(i));
                q.add(curr.left);
            }
            i++;
            if(i >= list.size()){
                break;
            }
            
            if(list.get(i) != -1){
                curr.right = new Node(list.get(i));
                q.add(curr.right);
            }
            i++;
        }       
        return root;
    }
};
