class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
         // Base case
        if (N == 1) {
            System.out.print(N + " ");
            return;
        }

        // Recursive call to print numbers before N
        printNos(N - 1);

        // Print the current number N
        System.out.print(N + " ");
    }
}

