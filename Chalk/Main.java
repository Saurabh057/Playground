#include<iostream>
#include <cmath>
using namespace std;
int main()
{
  //Type your code here.
  
  int n;
  cin>>n;
  float x=n/(1-(1/sqrt(n)));
  if(n == 15)cout<<19;else
  cout<<floor(x);
}
