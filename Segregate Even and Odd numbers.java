// User function Template for Java

class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                al.add(arr[i]);
            }
        }
        
        Collections.sort(al);
        
        ArrayList<Integer>al2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                al2.add(arr[i]);
            }
        }
        Collections.sort(al2);
        
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        int k=0;
        for(int i=al.size();i<n;i++){
            arr[i]=al2.get(k);
            k++;
        }
    }
}
