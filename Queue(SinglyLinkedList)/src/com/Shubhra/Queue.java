package com.Shubhra;

// QUEUE is Fist in First out. Its like a line in ticket counter.
// That means when a new guy comes, he stands in the end(tail) of the line.
// On the other hand, the guy who is in the front(head) of the line gets the ticket first
// and then leave the line.

// We can use our linkedlist concept to implement this. All we need is the InsertLast
// method from our linkedlist to Push items in our queue , and RemoveFirst Method from
// Linkedlist to Pop items.


public class Queue<T>
{


    Node head,tail; // get track of head and tail
    int size; // size of the queue


    // we use this subclass(class inside class) so we dont have to cast T explicitly.
    public class Node
    {
        public Node next;
        public T value;

        public Node(T value)
        {
            this.value = value;
        }
    }


    public Queue()
    {
        head = tail = null;
        size = 0;
    }

    // Similar to Insert Last in linkedList
    public void Push(T data)
    {
        Node n = new Node(data);
        if(isEmpty())
        {
           head = tail = n;
           return;
        }

        tail.next = n;
        n.next = null;
        tail = n;

    }

    public T Pop()
    {
        if(isEmpty())
        {
            return null;
        }
        Node n = head;
        head = n.next;
        return n.value;
    }

    public T Peek()
    {
        if(isEmpty())
        {
            System.out.print("Stack Underflow");
            return null;
        }
        return head.value;
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
