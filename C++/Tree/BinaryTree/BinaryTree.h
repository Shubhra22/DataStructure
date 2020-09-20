//
// Created by ShubhraSarker on 9/19/2020.
//

#ifndef BINARYTREE_BINARYTREE_H
#define BINARYTREE_BINARYTREE_H
#endif //BINARYTREE_BINARYTREE_H
#include "Node.h"

class BinaryTree {

public:
    int* nodes;
    int length;
    BinaryTree(int* nodes, int length);
    Node* CreateTree(Node* root, int i);
    void InOrder(Node* root);
};

