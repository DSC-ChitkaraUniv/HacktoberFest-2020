class Tree{
    void rightView(Node node) {
        //add code here.
        if(node==null)
        return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        Node temp=null;
        while(!q.isEmpty())
        {
            int level=q.size();
            for(int i=0;i<level;i++)
            {
                temp=q.poll();
                if(i==0)
                System.out.print(temp.data+" ");
                
                if(temp.right!=null)
                q.add(temp.right);
                
                if(temp.left!=null)
                q.add(temp.left);
            }
        }
        
        
    }
}
