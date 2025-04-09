
//User function Template for Java

class Sol
{
    int getCount (String S, int N)
    {
        // your code here
          if(S.length()==0||N<1){
            return 0;
        }
        
        int[] freque=new int[26];
        
        for(int v=0;v<S.length();v++){
            if(v>0&&S.charAt(v-1)==S.charAt(v)){
               continue;
            }
             int val=(int)S.charAt(v)-(int)'a';
            freque[val]++;
        }
        
        int count=0;
        for(int v:freque){
            if(v==N){
                count++;
            }
        }
        return count;


    }
}
