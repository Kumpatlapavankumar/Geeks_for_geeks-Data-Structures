class Solution {
    public static void operators(int a, int b, int c) {
        // code here
          int d=a ^ a;

    //Do c^b below
    int e=c ^ b;

    //Do a&b below
    int f=a & b;

    //Do c|(a^a) below
    int g=c | (a ^ a);
    //Do ~e below
    e=~ e;

    //The line below prints the output. Don't change it!
    System.out.println(d + " " + e + " " + f + " " + g);
    }
}
