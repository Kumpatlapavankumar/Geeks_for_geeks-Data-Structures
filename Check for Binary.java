//donot edot this code
class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  for(int i=0;i<str.length();i++){
          if(str.charAt(i)!='0' && str.charAt(i)!='1') return false;
        }
        return true;
	}
}
