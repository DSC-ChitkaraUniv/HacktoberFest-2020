/* class LinkList {
  int data;
  LinkList next;
  LinkList() {}
  LinkList(int d) {
    data=d;
  }
} */
class Result {
  static LinkList insertSorted(LinkList head, int data) {
    LinkList node = new LinkList(data),tmp;
    node.next=head;
    if(head==null)
    {
      node.next=node;
      head=node;
      return head;
    }
    else
    {
      tmp=head.next;
      while(tmp.next!=head)
        tmp=tmp.next;
      node.next=tmp.next;
      tmp.next=node;
    }
    for(LinkList x=head;x.next!=head;x=x.next)
    {
      for(LinkList y=x.next;y!=head;y=y.next)
      {
        if(x.data>y.data)
        {
          int val=x.data;
          x.data=y.data;
          y.data=val;
        }
      }
    }
    return head;
  }
}

