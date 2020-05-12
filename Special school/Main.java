#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s,s1,s2;
  cin>>s>>s1;
  int x = s1.length();
  int count = 0;
  for(int i = x;i>=0;i--)
  {
  	if(s[i] == s1[x-i-1])
       count++;
  }
  if(count -1 == x)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
    
  
}