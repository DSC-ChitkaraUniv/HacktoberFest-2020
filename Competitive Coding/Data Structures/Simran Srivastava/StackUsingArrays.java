import java.util.*;
class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize = s;
    stackArray = new int[maxSize];
    top=-1;
  }

  public void push(int j) // put item on top of stack
  {
    if(top==maxSize)
    {return ;}
    else
    {
      top++;
      stackArray[top]=j;
    }
  }
  
  public int pop() // take item from top of stack
  {
    int data=0;
    if(isEmpty())
    {return -1;}
    else
    {
    
      data=stackArray[top];
       stackArray[top]=0;
        top--;
     
    }
    return data;
  }

  public boolean isEmpty() // true if stack is empty
  {
    if(top==-1)
    {return true;}
    else
    {return false;}
  }

  public boolean isFull() // true if stack is full
  {
    if(top==maxSize)
    {return true;}
    else
    {return false;}
  }
}
class Main
{
  public static void main(String[] args)
  {
      
    CQStack theStack = new CQStack(10); // make new stack
    Scanner s=new Scanner(System.in);
    int n, q1, q2;
      theStack.top = -1;
      n= s.nextInt();
      while(n>0)
      {
        q1 = s.nextInt();
        if(q1 == 1){
          q2 = s.nextInt();
          theStack.push(q2);
        }
        else
          System.out.print(theStack.pop() + " ");
        n--;
      }
      System.out.print("\n");
  }
}