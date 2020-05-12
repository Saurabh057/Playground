#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i = 0 ; i < m ; i++)
    for(int j = 0 ; j < n ; j++)cin>>a[i][j];
  int sum[m],sum1[n],k = 0,l=0;
  for(int i = 0;i<m;i++)
  {int temp = 0,temp1 = 0;
  	for(int j = 0;j<n;j++)
    {
    	temp = temp+a[i][j];
      temp1 = temp1+a[j][i];
    } sum[k++] = temp;sum1[l++] = temp1;
  }int x,y;
  int max = 0; int max1 = 0;cout<<"Sum of rows is ";
  for(int i = 0;i  <k ;i++)
  {cout<<sum[i]<<" ";
    if(max<sum[i])
    {max = sum[i]; x = i;}
  }cout<<endl;cout<<"Row "<<x+1<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  max = 0;
  for(int i = 0;i  <k ;i++)
  {cout<<sum1[i]<<" ";
    if(max<sum1[i]){max = sum1[i];y = i;}
   
  }cout<<endl;cout<<"Column "<<y+1<<" has maximum sum";

}