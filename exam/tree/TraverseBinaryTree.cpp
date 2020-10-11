#include <iostream>
#include <stack>
#include <vector>
#include <queue>

using namespace std;

typedef struct BSNode
{
    int val;
    struct BST *left, *right;
} BSNode, *BSTree;

// preorder
void preOrder(BSNode *root)
{
    if (root == nullptr)
        return;
    cout << root->val << endl;
    preOrder(root->left);
    preOrder(root->right);
}

void preOrder(BSNode *root, vector<int> result)
{
    if (root == nullptr)
        return;
    stack<BSNode> stack_set;
    stack_set.push(root);
    while (!stack_set.empty())
    {
        BSNode *first = stack_set.pop();
        result.push_back(first->val);
        if (first->right != nullptr)
            stack_set.push(first->right);
        if (first->left != nullptr)
            stack_set.push(first->left);
    }
}

// inOrder中序遍历
void inOrder(BSNode *root)
{
    if (root == null)
        return;
    inOrder(root->left);
    cout << root->val << endl;
    inOrder(root->right);
}

void inOrder(BSNode *root)
{
    if (root == null)
        return;
    stack<BSNode> stack_set;
    stack_set.push(root);
    while (p || !stack_set.empty())
    {
        if (root != nullptr)
        {
            stack_set.push(root);
            root = root->left;
        }
        else
        {
            root = stack_set.pop();
            cout << root.val << endl;
            root = root->right;
        }
    }
}

// postOrder后续遍历
void postOrder(BSNode *root)
{
    if (root == nullptr)
        return;
    inOrder(root->left);
    inOrder(root->right);
    cout << root->val << endl;
}

void postOrder(BSNode *root)
{
    if (root == nullptr)
        return;
    stack<BSNode> stack_set;
    stack_set.push(root);
    while (!root || !stack_set.empty())
    {
        while (root->left != nullptr)
            stack.push(root->left);
        while (root->right != nullptr)
            stack.push(root->right);
        if (root->left == nullptr && root.right == nullptr)
        {
            cout << root->val;
            root = stack_set.pop();
        }
    }
}

//层次遍历
void LevelOrder(BSNode *root)
{
    if (root == nullptr)
        return;
    queue<BSNode> queue_set;
    queue_set.push(root);
    while (!queue_set.empty())
    {
        BSNode *head = queue_set.pop();
        cout << head->val << endl;
        if (head->left != nullptr)
            queue_set.push(head->left);
        if (head->right != nullptr)
            queue_set.push(head->right);
    }
}

//先序遍历和中序遍历构造二叉树
void createBinaryTreeByPrerderAndInorder(int[] num1, int[] num2)
{
    
}

int main(int argc, char const *argv[])
{

    return 0;
}
