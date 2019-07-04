package com.Shubhra;

public class Main {

    public static void main(String[] args)
    {
	    // write your code here
        SinglyLinkedList<Integer> s = new SinglyLinkedList<>();

        s.InsertFirst(10);
        s.InsertFirst(20);

        s.DeleteLast();

        s.Print();

    }
}
