//User function Template for Java

class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int length=v.length;
        if(length%2!=0){
            return v[length/2];
        }else{
            return (v[length/2]+v[(length/2)-1])/2;
        }
    }
}
