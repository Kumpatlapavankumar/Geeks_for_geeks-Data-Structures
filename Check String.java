//User function Template for Java
//donot edit this code
class Sol
{
    Boolean check (String s)
    {
        // your code here   
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i))
            return false;
        }
        return true;
    }
}
