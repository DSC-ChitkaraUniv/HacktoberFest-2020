/* class Node {
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()  {
    data=0;  }
  public Node(int d)  {
    data=d;  }
 } Above class is declared for use. */
static Node Mirror(Node src, Node mirror)
{
  if(src==null)
    return mirror;
  mirror=new Node(src.data);
  mirror.rightChild=Mirror(src.leftChild,mirror.rightChild);
  mirror.leftChild=Mirror(src.rightChild,mirror.leftChild);
  return mirror;
}
static Node findMirror(Node root)
{
  Node mirror=null;	
  return Mirror(root,mirror);
}
