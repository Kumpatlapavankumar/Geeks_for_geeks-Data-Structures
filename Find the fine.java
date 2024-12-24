// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        int fines=0;
        if(date%2==0){
            for(int i=0;i<car.length;i++){
                if(car[i]%2!=0)
                    fines+=fine[i];
            }
        }
        else if(date%2!=0){
            for(int i=0;i<car.length;i++){
                if(car[i]%2==0)
                    fines+=fine[i];
            }
        }
        return fines;
    }
}
