class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
       Set<Integer> hashSet = new HashSet<>(arr1);
 
Set<Integer> hashSet1 = new HashSet<>(arr2);
 
Set<Integer> hashSet2 = new HashSet<>(arr3);
 
HashMap<Integer, Integer> map = new HashMap<>();
 
        ArrayList<Integer> arrayList = new ArrayList<>();
 
        for (Integer i : hashSet) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer i : hashSet1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer i : hashSet2) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 3) {
                arrayList.add(entry.getKey());
            }
        }
 
        if (arrayList.isEmpty() ) {
 
arrayList.add(-1);
            return arrayList;
        }
Collections.sort(arrayList);
        return arrayList;
        }
}
