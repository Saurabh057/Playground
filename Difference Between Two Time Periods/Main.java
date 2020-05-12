#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int h1,r1,s1,h2,r2,s2;
  cin>>h1>>r1>>s1>>h2>>r2>>s2;
  if(s2>s1)
  {
    r1-=1;s1+=60;
  }
  if(r2>r1)
  {h1-=1;r1+=60;}
  cout<<h1-h2<<":"<<r1-r2<<":"<<s1-s2;
}