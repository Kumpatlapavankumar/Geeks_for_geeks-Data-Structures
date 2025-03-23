//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        String res = "";
      int i=0,j=0;
      for(; i<S1.length() && j<S2.length(); i++,j++){
          res = res+S1.charAt(i)+S2.charAt(j);
      }
      if(i<S1.length()){
          res = res+S1.substring(i);//,S1.length());
      }
      if(j<S2.length()){
          res = res+S2.substring(j);//,S2.length());
          
      }
      return res;
    }
} 
