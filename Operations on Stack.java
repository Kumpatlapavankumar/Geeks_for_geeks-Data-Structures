//User function Template for Java


class Geeks {  
    // Function to push an element into the stack.  
    public static void insert(Stack<Integer> st, int x) {  
        st.push(x); // Push the element onto the stack.  
    }  

    // Function to remove the top element from the stack.  
    public static void remove(Stack<Integer> st) {  
        if (!st.empty()) {  
            st.pop(); // Remove the top element if stack is not empty.  
        }  
    }  

    // Function to print the top element of the stack.  
    public static void headOf_Stack(Stack<Integer> st) {  
        if (!st.empty()) {  
            System.out.println(st.peek()); // Print the top element.  
        } else {  
            System.out.println("Stack is empty");  
        }  
    }  

    // Function to search for an element in the stack.  
    public static boolean find(Stack<Integer> st, int val) {  
        boolean exists = false; // To keep track of existence.  
        Stack<Integer> tempStack = new Stack<>(); // Temporary stack for preservation.  

        while (!st.empty()) {  
            int top = st.pop(); // Pop the top element.  
            tempStack.push(top); // Push to temporary stack.  

            if (top == val) {  
                exists = true; // Found the element.  
                break; // Exit if found.  
            }  
        }  

        // Restore the original stack order.  
        while (!tempStack.empty()) {  
            st.push(tempStack.pop());  
        }  

        return exists; // Return whether the element exists.  
    }  
}
