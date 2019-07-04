package com.Shubhra;


public class SinglyLinkedList<T>
{
    public Node head,tail;
    public int size;

    public class Node
    {
        public T data;
        public Node next;

        public Node(T data)
        {
            this.data = data;
        }
    }

    public void InsertFirst(T data)
    {
        Node n = new Node(data);
        if(isEmpty())
        {
            tail = head = n;
            return;
        }
        n.next = head;
        head = n;
        tail = n.next;
        size++;
    }

    public void InsertLast(T data)
    {
        Node n = new Node(data);

        if(isEmpty())
        {
            head = tail = n;
            return;

        }
        tail.next = n;
        tail = n;
    }

    public void InsertAfter(Node prevNode, T data)
    {
        if(prevNode==null) return;

        Node n =  new Node(data);
        n.next = prevNode.next;
        prevNode.next = n;

        size ++;
    }

    public void DeleteFirst()
    {
        if(isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        Node n = head;
        head = n.next;
        n = null;
        size--;
    }

    public void DeleteLast()
    {
        if(isEmpty())
        {
            System.out.println("List is empty");
            return;
        }
        tail = null;
        size--;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public void Print()
    {
        while (head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

}
