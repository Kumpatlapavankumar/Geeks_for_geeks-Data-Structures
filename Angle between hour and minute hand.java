//User function Template for Java
class Solution {
    static int getAngle(int H , int M) {
        // code here
        float ans=(float)Math.abs((30*H+0.5*M)-(6*M));
        if(ans>180){
            return (int)(360-ans);
        }
        return (int)ans;
    }
};
