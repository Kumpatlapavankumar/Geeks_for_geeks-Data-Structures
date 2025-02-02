//User function Template for Java
class Pair{
    Node node;
    int hd;
    Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(map.containsKey(hd)){
                map.get(hd).add(curr.data);
            }else{
                ArrayList<Integer> l=new ArrayList<>();
                l.add(curr.data);
                map.put(hd,l);
            }
            if(curr.left!=null){
                q.add(new Pair(curr.left,hd-1));
            }
            if(curr.right!=null){
                q.add(new Pair(curr.right,hd+1));
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> m:map.entrySet()){
            list.addAll(m.getValue());
        }
        return list;
    }
}
