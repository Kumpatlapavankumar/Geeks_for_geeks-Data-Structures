
/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
            int f1[] = new int[26];
            int f2[] = new int[26];
            
            for(char ch : s.toCharArray()) {
                f1[ch-'a']++;
            }
            
            for(char ch : s1.toCharArray()) {
                f2[ch-'a']++;
            }
            
            int count = 0;
            
            for(int i=0; i<26; i++) {
                count += Math.abs(f1[i] - f2[i]);
            }
            
            return count;
        }
}
