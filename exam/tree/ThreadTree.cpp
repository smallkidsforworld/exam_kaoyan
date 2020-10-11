#include <iostream>
#include <stack>
#include <vector>
#include <queue>

// lchild 的 指向对象
// ltag ==0 ->表示左孩
// ltag ==1 ->表示前驱

// rchild 的 指向对象
// rtag ==0 ->表示右孩
// rtag ==1 ->表示后继

typedef struct ThreadNode
{
    int val;
    struct ThreadNode *lchild, *rchild;
    int ltag, rtag;
} ThreadNode *ThreadTree;

// 构造线索二叉树通过中序遍历
void buildThreadTreeByInOrder(ThreadNode *p, ThreadNode *pre)
{
    if (p != nullptr)
    {
        buildThreadTreeByInOrder(p->lchild, pre);
        if (p->lchild == nullptr)
        {
            pre->lchild = p;
            pre->lchild = 1;
        }
        if (pre != nullptr && p->rchild == nullptr)
        {
            pre->rchild = p;
            pre->rchild = 1;
        }
        pre = p;
        buildThreadTreeByInOrder(p->rchild, pre);
    }
}

void createThread(ThreadNode *p)
{
    ThreadNode *result;
    if (p != nullptr)
    {
        buildThreadTreeByInOrder(p, result);
        result->rchild = nullptr;
        result->rchild = 1;
    }
}