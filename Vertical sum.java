
/*Complete the function below
Node is as follows:
class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null
}
}
*/
class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        vsumR(root,0,map);
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            list.add(x.getValue());
        }
        return list;
    }
    public void vsumR(Node root,int hd,TreeMap<Integer,Integer> map){
        if(root==null){
            return;
        }
        vsumR(root.left,hd-1,map);
        int sum=map.get(hd)==null?0:map.get(hd);
        map.put(hd,sum+root.data);
        vsumR(root.right,hd+1,map);
    }
}
