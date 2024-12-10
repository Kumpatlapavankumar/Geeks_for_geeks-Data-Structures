
class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
      HashSet<Integer> set1=new HashSet<>();
        for(int value:arr)
        {
            set1.add(value);
        }
        for(int j=A;j<=B;j++)
        {
            if(!set1.contains(j))
            {
                return false;
            }
        }
        return true;
    }
}
