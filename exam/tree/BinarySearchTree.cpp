#include <iostream>
typedef struct BSNode
{
    int val;
    struct BST *left, *right;
} BSNode, *BSTree;

// Recursion
BSNode *recursionFind(int val, BSNode *root)
{
    if (root == nullptr)
        return nullptr;
    if (root->val > val)
        return find(root->left);
    else if (root->val < val)
        return find(root->right);
    else
        return root;
}

// Non Recursion
BSNode *nonRecursionFind(int val, BSNode *root)
{
    while (root != nullptr && root->val != val)
    {
        if (root->val > val)
            root = root->left;
        else
            root = root->right;
    }
    return root;
}

// insert
// assume no repate num
// *********
bool insertIntoBST(BSNode *root, int val)
{
    if (root == nullptr)
    {
        root = (BSNode)malloc(sizeof(BSNode));
        root->val = val;
        root->left = nullptr;
        root->right = nullptr;
        return true;
    }
    else if (root->val == val)
        return false;
    else
    {
        if (root->val > val)
            insertIntoBST(root->left, val);
        else
            (root->val < val)
                insertIntoBST(root->right, val);
    }
}

//create
BSNode *create(int[] num, int size)
{
    BSNode *root;
    while (size > 0)
    {
        insertIntoBST(root, num[size--]);
    }
    return root;
}

//delete
bool *delete (BSNode *root, int val)
{
    if (root == nullptr)
        return false;
    // 1: if the val->node is leafe ,remove it directly
    // if a node with one side;
    // if a node with two side tree;
    if (root->val > val)
        delete(root->left,val);
    else if (root->val < val)
        delete(root->right,val);
    else{
        if(root->left==nullptr&&root->right==nullptr)
            root=nullptr;
        else if(root->left==nullptr)
            root=root->right;
        else if(root->right==nullptr)
            root=root->left;
        else{
            BSNode next=root->left;
            while(next.left!=null)
                next=next.left;
            root=next;
        }
    }
}

int main(int argc, char const *argv[])
{
    return 0;
}
