
class Solution {
    public String average(int arr[]) {
        // code here
        double sum = 0;
        for(int i: arr){
            sum +=i;
        }
        sum/=arr.length;
        return String.format("%.2f",sum);
    }
}
