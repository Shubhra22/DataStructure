//
// Created by ShubhraSarker on 9/19/2020.
//

#include "BinaryTree.h"
#include <bits/stdc++.h>

BinaryTree::BinaryTree(int nodes[], int length)
{
    this->nodes = nodes;
    this->length = length;
}

Node *BinaryTree::CreateTree(Node *root, int i)
{
    if(i>=length)
    {
        return nullptr;
    }
    Node* node = new Node(nodes[i]);
    root = node;
    root->leftNode = CreateTree(root->leftNode, 2 * i + 1);
    root->rightNode = CreateTree(root->rightNode, 2 * i + 2);
    return root;
}

void BinaryTree::InOrder(Node *root)
{
    if(root!= nullptr)
    {
        InOrder(root->leftNode);
        std::cout<<root->value << std::endl;
        InOrder(root->rightNode);
    }
}
void BinaryTree::PreOrder(Node *root)
{
    if(root!= nullptr)
    {
        std::cout<<root->value << std::endl;
        InOrder(root->leftNode);
        InOrder(root->rightNode);
    }
}
void BinaryTree::PostOrder(Node *root)
{
    if(root!= nullptr)
    {
        InOrder(root->leftNode);
        InOrder(root->rightNode);
        std::cout<<root->value << std::endl;
    }
}