//User function Template for Java

class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        String intStr="";
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i)))
            {
                intStr=intStr+S.charAt(i);
                if(i==S.length()-1){
                    a.add(Integer.parseInt(intStr));
                }
            } else {
                if(!intStr.equals(""))
                    a.add(Integer.parseInt(intStr));
                intStr="";
            }
        }
        if(a.isEmpty())
            return -1;
        Collections.sort(a);
        return a.get(a.size()-1);
    }    
} 
