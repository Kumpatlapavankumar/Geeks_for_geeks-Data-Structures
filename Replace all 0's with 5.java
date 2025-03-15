
/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
        String str1 = Integer.toString(n);
        char a[] = str1.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i] == '0'){
                a[i] = '5';
            }
        }
        String str = "";
        for(int i=0;i<a.length;i++){
            str = str + a[i];
        }
        int val = Integer.valueOf(str);
        return val;
    }
}
