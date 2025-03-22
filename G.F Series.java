//User function Template for Java
class Solution{
    static void gfSeries(int N){
        // code here
        long t1 = 0;
       long t2 = 1;
       
       System.out.print(0 + " " + 1 + " ");
       recursiveCall(t1,t2,N-2);
    }
     static void recursiveCall(long t1, long t2, int N) {
        if(N == 0) {
            System.out.println();
            return;
        }
        
        long t3 = (t1*t1)-t2;
        System.out.print(t3 + " ");
        recursiveCall(t2, t3, N-1);
    }
}
