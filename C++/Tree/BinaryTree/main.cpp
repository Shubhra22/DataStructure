#include <iostream>
#include "BinaryTree.h"
int main()
{
    int arr[] = {1,3,5,7,9};
    Node* root = new Node(arr[0]);
    BinaryTree* bt = new BinaryTree(arr,sizeof(arr)/sizeof(arr[0]));
    Node* rootNode = bt->CreateTree(root,0);
    bt->InOrder(rootNode);
    return 0;
}
