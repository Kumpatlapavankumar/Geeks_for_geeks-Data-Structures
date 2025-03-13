
class Solution {

    void printTriangle(int n) {
        // code here
        for (int i=1; i<=n; i++){
            for (int j=0; j<i-1; j++){
                System.out.print(" ");
            }
            for (int k=n; k>i; k--){
                System.out.print("*");
            }
            System.out.print("*");
            for (int l=n; l>i; l--){
                System.out.print("*");
            }
            for (int m=0; m<i-1; m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
