
// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class pair{
    Node node;
    int hd;
    pair(Node n,int h){
        node=n;
        hd=h;
    }
}
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // add your code
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(map.containsKey(hd)==false){
                // list.add(curr.data);
                map.put(hd,curr.data);
            }
            if(curr.left!=null){
                q.add(new pair(curr.left,hd-1));
            }
            if(curr.right!=null){
                q.add(new pair(curr.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            list.add(x.getValue());
        }
        return list;
    }
}
