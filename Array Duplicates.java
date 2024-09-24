
class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(array[i]>1){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
}
