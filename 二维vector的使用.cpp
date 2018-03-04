#include<iostream>
#include<vector>
using namespace std;

typedef struct point
{
    int x;
    int y;
}POINT;

int main()
{
    vector<vector<POINT> > a;
    for(int i = 0; i < 5; i++)
    {
        vector<POINT> b;
        a.push_back(b);
        for(int j = 0; j < 4; j++)
        {
            POINT c = {i, j};
            a[i].push_back(c);
        }
    }

  //用迭代器遍历打印
    vector<vector<POINT> >::iterator vec_it;
    for(vec_it = a.begin(); vec_it != a.end(); vec_it++)
    {
        vector<POINT>::iterator it;
        for(it = (*vec_it).begin(); it != (*vec_it).end(); it++)
        {
            cout << " [" <<it->x << "," << it->y << "] ";
        }
        cout << endl;
    }
    system("pause");
}