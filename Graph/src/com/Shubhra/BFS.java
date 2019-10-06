package com.Shubhra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS
{
    public void BFS(Node start, ArrayList<Node> vertices[])
    {
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.add(start);
        start.visited = true;
        while (!nodes.isEmpty())
        {
            Node visitedNode = nodes.poll();
            System.out.print(visitedNode.val+" ");

            visitedNode.visited = true;
            for (Node v:vertices[visitedNode.index])
            {
                if(!v.visited)
                {
                    nodes.add(v);
                    v.visited = true;
                }
            }
            System.out.println();

        }
    }

}
