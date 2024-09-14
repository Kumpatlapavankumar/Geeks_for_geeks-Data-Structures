
class Solution {
    // Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[]) {
        // your code here
        long n=hist.length;
        Stack<Integer> stack=new Stack<>();
        long result=0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && hist[stack.peek()]>=hist[i]){
                int curr=stack.pop();
                long temp=hist[curr]*(stack.isEmpty()?i:(i-stack.peek()-1));
                result=Math.max(result,temp);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int curr=stack.pop();
            long temp=hist[curr]*(stack.isEmpty()?n:(n-stack.peek()-1));
            result=Math.max(result,temp);
        }
        return result;
    }
}
