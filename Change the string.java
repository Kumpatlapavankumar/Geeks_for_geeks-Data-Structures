//User function Template for Java
//donot edit this code
class Solution{
    String modify(String s){
        if(s.length()==0){
            return "";
        }
        int n=(int)s.charAt(0);
        if(n>=65&&n<=90){
            return s.toUpperCase();
        }else{
            return s.toLowerCase();
        }
    }
}
