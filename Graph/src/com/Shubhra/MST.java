package com.Shubhra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MST
{
    class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2)
        {
            if (o1.edge>o2.edge)
            {
                return 1;
            }
            else if (o1.edge<o2.edge)
            {
                return -1;
            }
            return 0;
        }
    }

    // Prints all the nodes the tree visits to form the Minimum Spanning Tree
    public void Prims(Node start, ArrayList<Node> vertices[])
    {

        PriorityQueue<Node> nodes = new PriorityQueue<Node>(new NodeComparator());
        nodes.add(start);
        start.visited = true;
        while (!nodes.isEmpty())
        {
            Node head = nodes.poll();
            System.out.println(head.val);
            for (Node v:vertices[head.index])
            {
                if(!v.visited)
                {
                    nodes.add(v);
                    v.visited = true;
                }
            }
        }
    }
}
