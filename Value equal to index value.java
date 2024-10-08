class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.size();i++){
            if(nums.get(i-1)==i){
                list.add(i);
            }
        }
        return list;
    }
}
