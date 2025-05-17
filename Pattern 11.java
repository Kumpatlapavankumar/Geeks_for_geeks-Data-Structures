
class Solution {

    void printTriangle(int n) {
        // code here
          for(int i=1;i<=n;i++){
            //print numbers
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            for(int k=1;k<=n-1;k++){
                System.out.print(" ");
            }
            System.out.println();
    }
}
