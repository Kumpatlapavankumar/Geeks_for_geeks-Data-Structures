

class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static int findSum(String str) {
        // your code here
        int n = str.length();
    	int sum=0;
    	int num = 0;
    	for(int i=0; i<n; i++) {
    	    char c = str.charAt(i);
    	    if(Character.isDigit(c)) {
    	       num = num*10+Integer.parseInt(""+c);
    	    } else {
    	        sum+=num;
    	        num=0;
    	    }
    	}
    	return sum+num;
    }
}
