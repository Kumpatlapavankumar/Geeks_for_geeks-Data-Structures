
class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        // code here 
        int first=0,last=0;
        for(int i=0;i<arr.size();i++)
        {
            if(i<arr.size()/2)
            first+=arr.get(i);
            else
            last+=arr.get(i);
        }
        
        
        
        int ans=first-last;
        
        if(ans<0)
        {
            ans=ans*(-1);
        }
        
        return ans;
    }
}
