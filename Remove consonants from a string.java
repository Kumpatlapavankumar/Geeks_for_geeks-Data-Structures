//User function Template for Java

class Solution
{
    public String removeConsonants(String s)
    {
        //code here.
         if(s.length()==0){
            return "No Vowel";
        }
        StringBuilder str=new StringBuilder();
        
        for(int v=0;v<s.length();v++){
            char c=s.charAt(v);
            if((int)c>=65&&(int)c<90){
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    str.append(c);
                }
            }else{
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    str.append(c);
                }
            }
        }
        if(str.length()==0){
            return "No Vowel";
        }
        return str.toString();
    }
    
}
