// User function Template for Java

// Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) {
    // Your code here
    HashMap<String,Integer> keyPad = new HashMap<String,Integer>();
    
    keyPad.put("1",1);
    keyPad.put("ABC",2);
    keyPad.put("DEF",3);
    keyPad.put("GHI",4);
    keyPad.put("JKL",5);
    keyPad.put("MNO",6);
    keyPad.put("PQRS",7);
    keyPad.put("TUV",8);
    keyPad.put("WXYZ",9);
    
    String[] rep = {""};
    for(int i=0;i<s.length();i++){
        final int i1=i;
        keyPad.forEach((k,v)->{
            if(k.contains(String.valueOf(s.charAt(i1)).toUpperCase())){
                rep[0]=rep[0]+String.valueOf(v);
            }
        });
    }
    
    return rep[0];
}
