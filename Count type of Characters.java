class Sol {
    int[] count(String s) {
        // your code here
        int [] a=new int[4];
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))) {
                a[2]++;
            } else if(Character.isLetter(s.charAt(i)) && Character.isUpperCase(s.charAt(i))) {
                a[0]++;
            } else if(Character.isLetter(s.charAt(i)) && Character.isLowerCase(s.charAt(i))) {
                a[1]++;
            } else {
                a[3]++;
            } 
        }
        return a;
    }
}
