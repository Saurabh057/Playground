#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin>>s;
  for(int i = 0; i < s.length();i++)
  {
  	if ((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >= 'a' && s[i] <= 'z'))
  
  cout<<s[i];}
}