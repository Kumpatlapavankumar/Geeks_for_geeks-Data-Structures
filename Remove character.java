//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        // code here
        String str="";
        char []arr=string1.toCharArray();
        for(char i:arr){
            if(!(string2.contains(Character.toString(i)))){
                str+=i;
            }
        }
        return str;
    }
}
