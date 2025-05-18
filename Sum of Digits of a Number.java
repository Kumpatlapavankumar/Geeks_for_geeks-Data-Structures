
class Solution {
    // complete the function
    public static int sumOfDigits(int n) {
        // add your code here
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
