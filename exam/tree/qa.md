
# QA
_1-15:_  
    D,C,B,D,5) A(__not sure whether the node num contains self or not__),B,C(*叶子结点：2113也叫终端结点，是5261度为 0 的结点*),D,C,10)B,C,C,D,B,B  
_Comprehensive application_
1:no:
因为后序是左-右-根，无法从后序中判断前序中根节点后面的结点是左子树还是右子树，所以二叉树不一定唯一
2.3:
easy
4:  
k*(m-k^(log(k,m)))
max:k^h-1
min:k^(h-1)
5:coding
```cpp
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
    return 1 + max(theDeepthOfTree(root->firstsub), theDeepthOfTreeir(root->nextbro));
}

```
wrong:  
2) D,


# 二叉树与线索二叉树
_选择题_  
1-10:  
C,C,C,D,5)A,B,C,D,C,10)C
11-20:  
C,D,B,C,15)A,B,D,D,A,B
21-35：
B,A,A,A,25)D, 如果是根节点的左子树为空，则可能为1个，其他则不定。这里选择A,C,D,D,30)C,C,B,D,B,D

```
1：全部为右子树
2：仅为根节点
3：
```