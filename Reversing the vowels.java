
class Solution
{
    String modify (String s)
    {
        // your code here
        String vow="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vow+=c;
            }
        }
        int j=vow.length()-1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                sb.append(vow.charAt(j));
                j--;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
