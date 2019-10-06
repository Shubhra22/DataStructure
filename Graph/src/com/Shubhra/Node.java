package com.Shubhra;

public class Node<T>
{
    T val;
    int index;
    boolean visited;
    int edge = -1;

    public Node(T v, int index)
    {
        val = v;
        this.index = index;
    }

    public Node(T v, int index, int edge)
    {
        val = v;
        this.index = index;
        this.edge = edge;
    }

}
