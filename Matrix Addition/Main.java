#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;int a[m][n],b[m][n];
  for(int i = 0;i<m;i++)
  {
  	for(int j = 0;j<n;j++)
      cin>>a[i][j];
  }
  
  for(int i = 0;i<m;i++)
  {
  	for(int j = 0;j<n;j++)
      cin>>b[i][j];
  }
   for(int i = 0;i<m;i++)
  {
  	for(int j = 0;j<n;j++)
    {b[i][j]+=a[i][j];cout<<b[i][j]<<" ";}cout<<endl;
  }
}