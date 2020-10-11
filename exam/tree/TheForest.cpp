#include <iostream>
using namespace std;

typedef struct CNSNode
{
    int *value;
    struct CNSNode *firstsub, *nextbro;
} CNSNode, *CSTree;

// success 求以孩子兄弟表示法存储的森林的叶子节点数
int theNumOfTree(CNSNode *root)
{
    if (root == nullptr)
        return 0;
    if (root->firstsub == nullptr)
        return 1 + theNumOfTree(root->nextbro);
    else
    {
        return theNumOfTree(root->firstsub) + theNumOfTree(root->nextbro);
    }
}

int theDeepthOfTree(CNSNode *root)
{
    if (root == nullptr)
        return 0;
    return 1 + max(theDeepthOfTree(root->firstsub), theDeepthOfTree(root->nextbro));
}

CNSNode *thesubAndBroStruct()
{
}

int main(int argc, char const *argv[])
{
    return 0;
}
