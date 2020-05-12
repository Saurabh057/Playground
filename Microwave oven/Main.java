#include<iostream>
#include <iomanip>

using namespace std;
int main()
{
  //Type your code here.
  float n,time;
  cin>>n>>time;
  if(n==1)cout<< fixed << setprecision(2)<<1.00*time;
  else if(n==2)cout<< fixed << setprecision(2)<<1.50*time;
  else if(n==3)cout<< fixed << setprecision(2)<<2.00*time;
else
cout<<"Number of items is more";}