class Solution {
    public String longest(List<String> names) {
        // code here
        int size=names.size();
        if(size==0){
            return "-1";
        }
        int max=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<names.size();i++){
            String str=names.get(i);
            if(str.length()>max){
                max=str.length();
                j=i;
            }
        }
        return names.get(j);
    }
}
