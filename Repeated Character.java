//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        // your code here
        int n=S.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(S.charAt(i)==S.charAt(j)){
                    return S.charAt(i);
                }
            }
        }
        return '#';
    }
}
