class Solution {
    String firstAlphabet(String S) {
        // code here
        char[] charr=S.toCharArray();
        StringBuilder ans=new StringBuilder();
        ans.append(charr[0]);
        
        for(int i=1;i<charr.length;i++){
            if(charr[i-1]==' '){
                ans.append(charr[i]);
            }
        }
        return ans.toString();
    }
};
