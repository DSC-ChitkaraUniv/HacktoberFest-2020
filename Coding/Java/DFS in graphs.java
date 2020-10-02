import java.util.*;
import java.io.*;

class Graphs
{
    private int V;
    private LinkedList<Integer> adj[];
    //constructor
    Graphs(int v)
    {
        V = v;
        adj = new LinkedList[v]; 
        for(int i=0;i<v;i++)
        {
            adj[i] = new LinkedList(); ist
        }
    }
    
    void addEdge(int v, int w)
    {
        adj[v].add(w); 
    }
    
    void DFS(int s) 
    {
       
       boolean visited[] = new boolean[V];
       DFS_util(s,visited);
    } 
    void DFS_util(int s, boolean visited[])
    {
        visited[s] = true;
        System.out.print(s+ " ");
        
        Iterator <Integer> i = adj[s].listIterator();
        while(i.hasNext())
        {
            int n = i.next();
            if(!visited[n])
            {
                DFS_util(n,visited);
            }
        }
    }
    public static void main(String[] args)
    {
        Graphs g = new Graphs(4);
    
        g.addEdge(0, 1);
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3);
        System.out.print("The BFS for the given graph is  ");
        g.DFS(2);
        
        
        
    }
}
