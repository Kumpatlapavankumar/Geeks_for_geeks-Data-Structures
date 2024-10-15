/*Complete the Function below*/
class Solution {
    public static boolean palinArray(int[] arr) {
        // add code here.
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(palindrome(arr[i])==false){
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome(int num){
        int original=num;
        int reverse=0;
        while(num!=0){
            int n=num%10;
            reverse=reverse*10+n;
            num=num/10;
        }
        if(reverse==original){
            return true;
        }
        return false;
    }
}
