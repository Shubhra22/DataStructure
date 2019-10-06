package com.Shubhra;

// Represent graph with adjacency matrix
public class Graph
{
    public int numOfvertices;
    private boolean[][] adj;

    public Graph(int v)
    {
        numOfvertices = v;
        adj = new boolean[numOfvertices][numOfvertices];

        for (int i = 0;i<v;i++)
        {
            for(int j = 0; j<v;j++)
            {
                adj[i][j] = false;
            }
        }

    }

    public void AddEdge(Node a, Node b)
    {
        adj[a.index][b.index] = true;
        adj[b.index][a.index] = true;
    }

    public void print()
    {
        for (int i = 0;i<numOfvertices;i++)
        {
            for(int j = 0; j<numOfvertices;j++)
            {
                System.out.print(adj[i][j]?1:0 + "");
            }
            System.out.println();
        }

    }

}
