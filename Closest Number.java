//donot edit this code 
class Solution {
    static int closestNumber(int N , int M) {
        // code here
        int rem=N%M;
        if(rem==0){
            return N;
        }
        int i=N,j=N;
        while(true){
            if(i%M==0){
                return i;
            }else{
                i--;
            }
            if(j%M==0){
                return j;
            }else{
                j++;
            }
        }
    }
};
