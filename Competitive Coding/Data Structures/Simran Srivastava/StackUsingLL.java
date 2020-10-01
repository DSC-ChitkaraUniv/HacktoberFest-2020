import java.util.*;

class LinkList
{
  public int data; // data item
  public LinkList next; // next link in list
  public LinkList(int dd) // constructor
  { data = dd; }
}

class LinkStack
{
  private LinkList first; // ref to first item on list
  public LinkStack() // constructor
  {
    first=null;
  }

  public boolean isEmpty()
  {
    LinkList last=first;
    if(last==null)
    {return true;}
    else
    {return false;}
  }

  public void push(int dd)
  {
    LinkList n = new LinkList(dd);
    n.next=first;
    first=n;
  }

  public int pop()
  {
    int p;
    if(isEmpty())
    {return -1;}
    else
    {p=first.data;
      first=first.next;}
    return p;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int t, n, q1, q2;
   LinkStack theStack = new LinkStack(); // make new stack
      n= s.nextInt();
      while(n>0)
      {
        q1 =s.nextInt();
        if(q1 == 1){
          q2 = s.nextInt();
          theStack.push(q2);
        }
        else
          System.out.print(theStack.pop() + " ");
        n--;
      }
      System.out.print("\n");
      theStack = null;
  }
}