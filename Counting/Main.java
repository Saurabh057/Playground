#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int i = 0;
  int V,C,W,D,S;
  V=C=W=D=S=0;
  while(s[i]!='\0') {
    if(s[i] ==' ')
      W++;
    else if(s[i]>='0'&&s[i]<='9')
      D++;
    else if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
      V++;
    else if(s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
      V++;
    else if(s[i]>='a'&&s[i]<='z' || s[i]>='A'&&s[i]<='Z')
      C++;
    else
      S++;
    i++;
  }
  cout<<"Vowels:"<<V<<endl;
  cout<<"Consonants:"<<C<<endl;
  cout<<"White Spaces:"<<W<<endl;
  cout<<"Digits:"<<D<<endl;
  cout<<"Symbols:"<<S<<endl;
}