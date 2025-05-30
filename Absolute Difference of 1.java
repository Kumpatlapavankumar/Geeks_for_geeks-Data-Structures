// User function Template for Java

class Solution {
    public ArrayList<Integer> getDigitDiff1AndLessK(int[] arr, int k) {
        // code here
        ArrayList<Integer> less=new ArrayList<>();
        for(int v=0;v<arr.length;v++){
            if(arr[v]<k){
                if(check(arr[v])){
                    less.add(arr[v]);
                }
            }
        }
        return less;
    }

    static boolean check(int num){
        if(num<10){
            return false;
        }
        int val=num%10;
        num=num/10;
        while(num!=0){
            int rem=num%10;
            num/=10;
            if(Math.abs(rem - val) != 1){
                return false;
            }
            val=rem;
        }
        return true;
    }
}
