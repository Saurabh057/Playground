#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char a[40][40];
  int i,n = 0;
 	for(i = 0 ; i < 5; i++)
    {
      cin.getline(a[i],40);
      n++;
      if(!strcmp(a[i],"####"))
         break;
    }cout<<a[0]<<endl;
  for(i = 0 ; i < n ; i++)
  {
  	if(a[i][strlen(a[i])-1] == a[i+1][0])
  	cout<<a[i+1]<<endl;
  }
}