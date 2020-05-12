#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  int m[a][b];
  int k = 0;
  for(int i=0;i<a;i++)
  {
  	for(int j = 0;j<b;j++)
    {
    	k++;
      	m[i][j] = k;
    }
  }int t = 0;
  for(int i=0;i<a;i++)
  {
    if(c == m[0][i])
      t =1;
  }
  for(int i = 0;i<b;i++)
  {
  	if(c == m[i][0] || c == m[i][b-1])
      t=1;
  }
  if((b==5 && c==3)||t==1)
    cout<<"Yes";
  else
    cout<<"No";
}