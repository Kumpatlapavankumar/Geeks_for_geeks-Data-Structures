
//User function Template for Java
class Solution
{
   
    String modify(String S)
    {
        // your code here
        int n=S.length();
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<n){
            if(S.charAt(i)==' '){
                i++;
            }else{
                res.append(S.charAt(i));
                i++;
            }
        }
        return res.toString();
    }
}
