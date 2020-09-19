package com.company;

public class Main {

    public static void main(String[] args)
    {
	    // write your code here
        int[] bt = {2,4,1,5,3,6,9};
        BinaryTree binaryTree = new BinaryTree(bt);
        Node root = new Node(bt[0]);
        Node n = binaryTree.CreateTree(root);
        //binaryTree.inOrder(n);
    }
}
