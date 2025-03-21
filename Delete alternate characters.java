// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
         if(S.length()==0){
            return null;
        }
        StringBuilder str=new StringBuilder();
        
        for(int v=0;v<S.length();v+=2){
            str.append(S.charAt(v));
        }
        return str.toString();
    }
}
