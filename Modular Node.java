/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/
// Your task is to complete the function
// function should return the modular Node
// if no such node is present then return -1
class Solution {
    public int modularNode(Node head, int k) {
        // Code here//Position this line where user code will be pasted.
        Node temp=head;
          
          ArrayList<Integer>list1=new ArrayList<>();
          while(temp!=null)
          {
            list1.add(temp.data);
             temp=temp.next;

          }
          for(int j=list1.size()-1;j>=0;j--)
          {
              int m=j+1;
               
              if(m%k==0)
              {
                  return list1.get(j);
              }
          }
          return -1;
    }
}
