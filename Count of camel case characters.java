
class Sol {
    int countCamelCase(String s) {
        // your code here
        int c=0;
        for(int m=0;m<s.length();m++){
           
            if(s.charAt(m)>64 && s.charAt(m)<97){
                c++;
            }
        }
        return c;
    }
}
