class Hanoi {
    long count=0;
    public long toh(int n, int from, int to, int aux) {
        // Your code here
        if(n==0){
            return 0;
        }
        toh(n-1,from,aux,to);
        System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
        count++;
        toh(n-1,aux,to,from);
        return count;
    }
}
