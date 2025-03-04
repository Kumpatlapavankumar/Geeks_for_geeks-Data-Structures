class StrongestNeighbour{
    
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
         if(sizeOfArray==0)
         return;
         for(int v=1;v<sizeOfArray;v++){
             if(arr[v-1]>=arr[v]){
                 System.out.print(arr[v-1]+" ");
             }else{
                 System.out.print(arr[v]+" ");
             }
         }
        
    }
}
