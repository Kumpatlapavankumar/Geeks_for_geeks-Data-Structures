// User function Template for Java

public static Stack<Integer> _push(int arr[]) {
    // Your code here
    Stack<Integer> s = new Stack<>();
    for(int i : arr){
        s.push(i);
    }
    return s;
}

public static void _pop(Stack<Integer> s) {
    // Your code here
    while(!s.isEmpty()){
        System.out.print(s.pop() + " ");
    }
}
