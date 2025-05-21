class Solution {

    void printTriangle(int n) {
        int totalLine = n;
        
        int PrintNumber = 1;
        int number = 1;
        
        int currentLine = 1;
        
        
        
        while(currentLine <= totalLine){
            for(int i=1; i<=number; i++){
                System.out.print(PrintNumber + " ");
                PrintNumber++;
            }
            
            System.out.println();
            currentLine++;
            number++;
        }
    }
    
    void main(String[] args){
        printTriangle(5);
    }
}
