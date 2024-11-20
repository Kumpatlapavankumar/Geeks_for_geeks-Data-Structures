//User function Template for Java

class Solution{
    int middle(int A, int B, int C){
        //code here
        if((A<=B && B<=C) || (C<=B && B<=A) ){
            return B;
        }
        else if((B<=A && A<=C) || (C<=A && A<=B)){
            return A;
        }
        else{
            return C ;
        }
    }
}
