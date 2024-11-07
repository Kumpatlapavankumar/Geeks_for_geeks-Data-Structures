
class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int max = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        char[] ch = line.toCharArray();
        
        Arrays.sort(ch);
        HashMap<Character, Integer> map  = new HashMap<>();
        for(char x : ch){
            map.put(x, map.getOrDefault(x,0)+1);
            max = Math.max(max, map.get(x)); 
        }
        
        for(Map.Entry<Character, Integer> key : map.entrySet()){
            if(key.getValue()==max)
                res = Math.min((int)key.getKey(), res);
        }
        return (char)res;
    }
    
}
