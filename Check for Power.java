
//User function Template for Java
//long power of another
class Solution{
    static Long isPowerOfAnother(Long X, Long Y){
        // code here
         if(Y==1){
            return (long)1;
        }
        else if(X==1){
            return (long)0;
        }
        if(Y%X!=0){
            return (long)0;
        }
        return isPowerOfAnother(X,Y/X);
    }
}
