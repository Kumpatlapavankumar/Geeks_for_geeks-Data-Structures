
// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
         switch(str) {
            
            case "Character":
                return 1;
                
            case "Double":
                return 8;
                
            case "Integer":
                return 4;
                
            case "Long":
                return 8;
                
            case "Float":
                return 4;
                
            default:
                return -1;
         }
    }
}
