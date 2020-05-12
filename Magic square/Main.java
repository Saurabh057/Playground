#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n][n];
  for(int i = 0; i < n; i++)
    for(int j = 0 ; j < n ;j++)cin>>a[i][j];
  int sum1 = 0,sum2=0;
  for(int i = 0; i < n; i++)
    sum1+=a[i][i];
  for (int i = 0; i < n; i++) { 
        for (int j = 0; j < n; j++) { 
  
            // Condition for secondary diagonal 
            if ((i + j) == (n - 1)) 
                sum2 = sum2+a[i][j];
        } 
    } if(sum1==sum2)
    cout << "Yes";
  else
    cout<<"No";
}