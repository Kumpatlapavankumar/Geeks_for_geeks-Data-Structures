class Solution{
    //donot edit this code
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int result=a^b;
        int count=0;
        while(result>0){
            result=result&(result-1);
            count++;
        }
        return count;
    }
    
    
}
