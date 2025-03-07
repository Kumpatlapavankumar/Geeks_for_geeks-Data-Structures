//User function Template for Java
class Solution{
    String isVowel(char c){
        // code here
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for (char x:vowels){
            if(c==x){
                return "YES";
            }
        }
              return "NO";
    }
}
