//User function Template for Java
class Solution{
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> table = new ArrayList<>();
        for(int i=1; i<=10; i++) {
            table.add(i*N);
        }
        return table;
    }
}
