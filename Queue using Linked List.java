/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
	void push(int a)
	{
        QueueNode node = new QueueNode(a);
        if(rear==null){
          rear = front = node;
        }else{
          rear.next = node;
          rear = node;
        }
	}
	int pop()
	{
        if(front == null){
          return -1;
        }
        int current = front.data;
        front = front.next;
        if(front == null){
          rear=null;
        }
        return current;
	}
}
