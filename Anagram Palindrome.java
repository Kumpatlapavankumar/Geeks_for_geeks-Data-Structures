//don't edit this code
class Sol
{
    int isPossible (String S)
    {
        // your code here
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0; i<S.length(); i++){
            char ch=S.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        int count=0;
        for(Integer n:hm.values()){
            if((n%2)!=0){
                count++;
                if(count>1){
                    return 0;
                }
            }
        }
        return 1;
    }
}
