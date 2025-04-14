//User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        char[] arr=S.toCharArray();
        int R=0,G=0;
        for(char c:arr){
           if(c=='R')
           R++;
           else 
           G++;
        }
        return S.length()-Math.max(R,G);
    }
}
