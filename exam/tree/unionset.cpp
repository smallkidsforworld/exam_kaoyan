#include <iostream>
using namespace std;

#define MAXSIZE 20

int unionset[MAXSIZE];

void initstate(int unionset[])
{
    for (int i = 0; i < MAXSIZE; ++i)
    {
        unionset[i] = -1;
    }
}

int find(int unionset[], int x)
{
    while (unionset[x] > 0)
    {
        x = unionset[x];
    }
    return x;
}

// two set with no intersect
// root1 means one set
// root2 means another set
// after this operate, we make the two set union .

void unionSet(int unionset[], int root1, int root2)
{
    unionset[root1] = root2;
}


int main()
{
    cout << "fuck" << endl;
}