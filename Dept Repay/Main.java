#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  cin>>p>>r>>t;
  float i,a,d,f;
  i = p*r*t/100;
  a = p+i;
  d = i*0.02;
  f = a-d;
  cout<<i<<endl;
  cout<<a<<endl;
  cout<<d<<endl;cout<<f<<endl;
}