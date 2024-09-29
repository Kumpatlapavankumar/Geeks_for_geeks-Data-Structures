
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int low=0;
        int high=0;
        while(low<n && high<m){
            if(a1[low]==a2[high]){
                low++;
                high++;
            }else{
                low++;
            }
        }
        if(high==m){
            return "Yes";
        }else{
            return "No";
        }
    }
}
