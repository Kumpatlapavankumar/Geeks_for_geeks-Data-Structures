class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='1'){
                count++;
            }
        }
        return (count*(count-1))/2;
    }
}
