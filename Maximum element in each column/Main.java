#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i = 0 ;i < m ;i++)
    for(int j = 0;j < n ;j++)cin>>a[i][j];
  int max = 0;
  for(int k = 0;k<n;k++)
  {max = 0;
        for(int i = 0;i<m;i++)
        {
          if(max <= a[i][k])
             max = a[i][k];
        }
    	cout<<max<<endl;
    }
}