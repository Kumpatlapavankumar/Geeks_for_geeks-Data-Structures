class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ans=new Long[2];
        long x=A;
        long y=B;
        while(y!=0){
            Long temp=y;
            y=x%y;
            x=temp;
        }
        ans[0]=A*B/x;
        ans[1]=x;
        return ans;
    }
};
