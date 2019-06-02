package com.Shubhra;

public class Stack<T>
{
    Node head;
    int size;

    public Stack()
    {
        head = null;
        size = 0;
    }

    public void Push(T data)
    {
        if(head ==null) // if this is the first element in our stack
        {
            // We create a new Node and make it the head
            Node n = new Node(data);
            n.next = null;
            head = n;
            return;
        }
        //otherwise we create a node and point it to the head

        Node n = new Node(data);
        n.next = head;
        head = n;
        size++;

    }

    public T Pop()
    {
        if(isEmpty())
        {
            System.out.print("Stack Underflow");
            return null;
        }
        Node n = head;
        T val = (T) n.value;
        head = n.next;
        size--;
        return val;
    }

    public T Peek()
    {
        if(isEmpty())
        {
            System.out.print("Stack Underflow");
            return null;
        }
        return (T) head.value;
    }

    public int Size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public void ShowAll()
    {
        while (!isEmpty())
        {
            System.out.println(Pop());
        }
    }
}
