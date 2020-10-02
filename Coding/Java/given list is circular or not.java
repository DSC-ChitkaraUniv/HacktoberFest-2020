/* class LinkList
{
  int data;
  LinkList next;
} */

static int isCircular(LinkList head)
{
  if(head==null)
    return 1;
  LinkList tmp=head.next;
  while(tmp!=head)
  {
    if(tmp==null)
      return 0;
    tmp=tmp.next;
  }
  return 1;
}
