#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[3];
  cin>>a[0]>>a[1]>>a[2];
  int min = a[0];
  for(int i = 0; i < 3 ; i++)
  {
  	for(int j = 0;j<3;j++)
    {
    	if(a[j]>a[i])
           {
           	int temp = a[i];
             a[i] = a[j];
             a[j] = temp;
           }
    }
  }int x = 1;
  for(int i = 1; i <=a[0] ;i++)
    if(a[0]%i == 0 && a[1]%i == 0 && a[2]%i == 0)
    {
    	x = i;
    }
  cout<<"The treasure is in box which has number "<<a[1]<<endl;
  cout<<"The code to open the box is "<<x;
}