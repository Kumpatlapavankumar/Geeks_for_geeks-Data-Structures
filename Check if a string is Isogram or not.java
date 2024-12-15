class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        HashSet<Character> str= new HashSet<>();
        for(int i=0;i<data.length();i++)
        {
            str.add(data.charAt(i));
        }
        int a=str.size();
        int b=data.length();
        if(a==b) return true;
        return false;
    }
}
