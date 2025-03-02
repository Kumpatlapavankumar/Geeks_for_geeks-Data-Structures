
// User function Template for Java

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
          Arrays.sort(arr);
        int left=0,right=arr.length-1;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                ans.add(arr[right--]);
            }
            else{
                ans.add(arr[left++]);
            }
        }
        return ans;
    }
}
