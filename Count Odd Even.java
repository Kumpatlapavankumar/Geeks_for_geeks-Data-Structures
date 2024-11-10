
// User function Template for Java

class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int[] result=new int[2];
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        result[1]=evencount;
        result[0]=oddcount;
        return result;
    }
}
