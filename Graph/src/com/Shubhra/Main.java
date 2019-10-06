package com.Shubhra;

public class Main
{
    public static void main(String[] args)
    {
        //Graph g = new Graph(5);
        GraphList g = new GraphList(8);
        Node A1 = new Node(1,0,-1);
        Node A2 = new Node(2,1,-1);
        Node A3 = new Node(3,2,-1);
        Node A4 = new Node(4,3,-1);
        Node A5 = new Node(5,4,-1);
        Node A6 = new Node(6,5,-1);
        Node A7 = new Node(7,6,-1);
        Node A8 = new Node(8,7,-1);

        g.AddEdge(A1,A2,4);
        g.AddEdge(A2,A3,18);
        g.AddEdge(A2,A4,8);
        g.AddEdge(A4,A5,5);
        g.AddEdge(A1,A5,2);
        g.AddEdge(A1,A4,10);
        g.AddEdge(A4,A7,11);
        g.AddEdge(A4,A8,9);
        g.AddEdge(A8,A6,2);
        g.AddEdge(A7,A6,1);

        MST m = new MST();
        m.Prims(A1,g.vertices);

//        BFS b = new BFS();
//        b.BFS(A1,g.vertices);

    }
}
