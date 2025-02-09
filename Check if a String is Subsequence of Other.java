class Solution
{
    //Function to check if a string is subsequence of other string.
    public static boolean isSubSequence(String A, String B)
    {
        //code here
        int low=0;
        int high=0;
        while(low<A.length() && high<B.length()){
            if(A.charAt(low)==B.charAt(high)){
                low++;
                high++;
            }else{
                high++;
            }
        }
        if(low==A.length()){
            return true;
        }
        return false;
    }
};
