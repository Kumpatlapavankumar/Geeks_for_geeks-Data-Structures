//User function Template for Java

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Integer key=entry.getKey();
            Integer value=entry.getValue();
            if(value%2!=0){
                return key;
            }
        }
        return -1;
    }
}
