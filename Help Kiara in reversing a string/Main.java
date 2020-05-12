#include <iostream>
#include<string.h>
using namespace std;

int main()
{
char str[100], rev[100];     
int count = 0, end,k=0;    
cin.getline(str,100);
for(int i=strlen(str)-1;i>=0;i--)
{
  rev[k]=str[i];
  k++;

  
}
 rev[k]='\0';
  cout<<rev;
}