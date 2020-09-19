package com.company;

public class BinaryTree
{
    public int[] nodes;

    public BinaryTree(int[] nodes)
    {
        this.nodes = nodes;
    }

    public Node CreateTree(Node root)
    {
        return  CreateTreeHelper(root,0);
    }

    private Node CreateTreeHelper(Node root,int i)
    {
        if(i<nodes.length)
        {
            Node n = new Node(nodes[i]);
            root = n;
            root.left = CreateTreeHelper(root.left,2*i+1);
            root.right = CreateTreeHelper(root.right,2*i+2);
        }
        return root;
    }

    public void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }
}
