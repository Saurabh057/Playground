#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;int n;
  cin>>s>>n;
  if(s ==  "front")
  {
  	if(n==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  if(s ==  "rear")
  {
  	if(n==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
      
  }
}