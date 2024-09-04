
class Solution
{
    //donot edit this code 
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        Queue<Integer> wq=new LinkedList<>();
        q.add(root);
        wq.add(0);
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        mp.put(0,root.data);
        while(!q.isEmpty()){
            Node temp=q.remove();
            int tw=wq.remove();
            mp.put(tw,temp.data);
            if(temp.left!=null){
                q.add(temp.left);
                wq.add(tw-1);
            }
            if(temp.right!=null){
                q.add(temp.right);
                wq.add(tw+1);
            }
        }
        ArrayList<Integer> key=new ArrayList<Integer>(mp.keySet());
            Collections.sort(key);
            for(int k:key){
                ans.add(mp.get(k));
            }
        return ans;
    }
}
