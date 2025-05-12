class Solution {
    static int majorityElement(int arr[]) {
        // code here
         int n = arr.length;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : arr){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        
        int num = n/2;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>num){
                return entry.getKey();
            }
        }
        return -1;
    }
}
