//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        String result="";
        if (S.length() > 0) {
            result += S.charAt(0);
        }
        for(int i=1;i<S.length();i++){
            if(S.charAt(i-1)!=S.charAt(i)){
                result=result+S.charAt(i);
            }
        }
        return result;
    }
}
