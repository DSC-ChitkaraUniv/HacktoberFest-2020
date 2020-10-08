import java.util.*;

class CQStack
{
  public int maxSize; // size of stack array
  public int[] stackArray;
  public int top; // top of stack

  public CQStack(int s) // constructor
  {
    maxSize = s; // set array size
    stackArray = new int[maxSize]; // create array
    top = -1; // no items yet
  }
  public boolean isEmpty() // true if stack is empty
  {
    return (top == -1);
  }
  public boolean isFull() // true if stack is full
  {
    return (top == maxSize-1);
  }

  public void push(int j) // put item on top of stack
  {
    if(isFull())
    {
    }
    else
    {
      stackArray[++top] = j; // increment top, insert item
    }
  }
  public int pop() // take item from top of stack
  {
    if (isEmpty())
    {
      return -1;
    }
    else
    {
      int temp=stackArray[top--];
      return temp; // access item, decrement top
    }
  }
}

class Result {
  static int evalPrefix(CQStack s, String exp) {
        int i, op1, op2, answer;
    for (i = exp.length()-1; i >= 0 ; i--)
    {
      // If the scanned character is an operand (number here), push it to the stack.
      char c = exp.charAt(i);
      if (Character.isDigit(c))
        s.push(c - '0');

      // If the scanned character is an operator, pop two elements from stack apply the operator
      else
      {
        op1 = s.pop();
        op2 = s.pop();
        switch(c)
        {
          case '+': s.push(op1 + op2); break;
          case '-': s.push(op1 - op2); break;
          case '*': s.push(op1 * op2); break;
          case '/': s.push(op1 / op2); break;
          case '^': s.push((int)Math.pow(op1,op2)); break;
        }
      }
    }
    answer = s.pop();
    return answer;
  }
}

class PreFixEval
{
  public static void main(String[] args)
  {
    CQStack theStack = new CQStack(100); // make new stack
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
    String st;
    t = Integer.parseInt(s.nextLine());
    while(t>0)
    {
      st = s.nextLine();
      System.out.println(Result.evalPrefix(theStack, st));
      t--;
    }
  }
}