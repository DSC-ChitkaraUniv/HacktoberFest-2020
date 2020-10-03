/* class QueueNode
{
  int data;
  int priority;
  QueueNode next;
  public QueueNode(int data, int p) 
  {
    this.data = data;
    this.priority = p;
  }
} is provided to you. */ 

class PQueueLL
{
  public QueueNode front=null, rear=null;
  public void EnQueue(int data, int priority)
  {
    
    QueueNode qn=new QueueNode(data,priority);
    if(front==null&&rear==null)
    {
      front=rear=qn;
      qn.next=null;
    }
    else if(priority==0 || front.priority>priority)
    {
      QueueNode tmp=front;
      if(front.priority>0)
      {
        qn.next=tmp;
        front=qn;
      }
      else
      {
        while(tmp.next.priority==0 && tmp.next!=null)
          tmp=tmp.next;
        qn.next=tmp.next;
        tmp.next=qn;
      }
       
    }
    else if(priority==9 || rear.priority<=priority)
    {
      rear.next=qn;
      rear=qn;
      qn.next=null;
    }
    else
    {
      QueueNode tmp=front;
      while(tmp.next.priority<=priority)
        tmp=tmp.next;
      qn.next=tmp.next;
      tmp.next=qn;
    }
    
  }    

  public int DeQueue()
  {
    if(front==null)
      return -1;
    int val=front.data;
    front=front.next;
    QueueNode tmp=front;
    return val;
  }    
}
