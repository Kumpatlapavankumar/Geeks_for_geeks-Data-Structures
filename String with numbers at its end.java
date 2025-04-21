//User function Template for Java

class Solution {
    int isSame(String s) {
        // code here
         if(s.length()==0){
            return 0;
        }
        int sum=0;
        int count=0;
        for(int v=0;v<s.length();v++){
            int val=(int)s.charAt(v)-(int)'0';
            if(val>=0&&val<10){
                sum=sum*10+val;
                count++;
            }
        }
        int subVal=s.length()-count;
        if(subVal==sum){
            return 1;
        }else{
            return 0;
        }
    }
}
