// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
          if(S1.length()!=S2.length()){
            return 0;
        }
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        
        for(int i=0;i<S1.length();i++){
            s1[S1.charAt(i)-'a']++;
        }
        
        for(int i=0;i<S2.length();i++){
            s2[S2.charAt(i)-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(s1[i]!=s2[i]){
                return 0;
            }
        }
        return 1;
    }
}
