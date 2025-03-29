// User function Template for Java

class Solution {
    static int isGoodorBad(String S) {
        // code here
         int count=0;
        int count2=0;
        int i=0;
        while(i<S.length())
        {
            char ch=S.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
             {
                count++;
                if(count>5)
                {
                     return 0;
                }
                count2=0;
             }
             else if(ch=='?'){
                count++;
                count2++;
                if(count>5)
                {
                    return 0;
                }
                 else if(count2>3)
                 {
                     return 0;
                 }

             }
             else 
             {

                 count2++;
                 if(count2>3)
                 {
                     return 0;
                 }
                 count=0;
             }
              i++;
        }
        return 1;
    }
};
