// User function Template for Java
class Solution {
    String removeVowels(String S) {
        // code here
        StringBuilder str=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&
            ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'){
                str.append(ch);
            }
        }
        return str.toString();
    }
}
