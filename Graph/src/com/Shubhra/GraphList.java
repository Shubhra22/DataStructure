package com.Shubhra;

import java.util.*;

// Represent graph with adjacency List
public class GraphList
{

    public ArrayList<Node> vertices[];
    int numOfvertices;


    public GraphList(int v)
    {
        vertices = new ArrayList[v];
        numOfvertices = v;
        for (int i = 0;i<v;i++)
        {
            vertices[i] = new ArrayList<Node>();
        }
    }

    // Add an edge
    public void AddEdge(Node v1, Node v2)
    {
        vertices[v1.index].add(v2);
        vertices[v2.index].add(v1);
    }

    // Adding Edge with a weight
    public void AddEdge(Node v1, Node v2, int weight)
    {
        vertices[v1.index].add(v2);
        vertices[v2.index].add(v1);
        v2.edge = weight;
    }


}

