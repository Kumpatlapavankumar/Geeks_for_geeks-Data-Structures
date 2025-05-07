
// User function Template for Java

class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int arr1[], int arr2[], int x) {
        // code here.
         HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            hm.put(arr2[i],2);
        }
        int count=0;
        for(int i=0;i<arr1.length;i++){
            int sum=x-arr1[i];
            if(hm.containsKey(sum)){
                count++;
            }
        }
        return count;
    }
}
