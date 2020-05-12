#include<iostream>
using namespace std;
int main()
{
  cout<<"Enter the number of elements in the array\n";
  int a;
  cin>>a;
  int b[a];
  cout<<"Enter the elements in the array\n";
  for(int i = 0; i < a; i++)
    cin>>b[i];
  cout<<"Enter the location where you wish to insert an element\n";
  int c;
  cin>>c;
  if(c > a) {
    cout<<"Invalid Input";
    return 0;
  }
  cout<<"Enter the value to insert\n";
  int d;
  cin>>d;
  cout<<"Array after insertion is\n";
  for(int i = 1; i <= a; i++){
    if(i == c)
      cout<<d<<endl;
    cout<<b[i - 1]<<endl;
  }
  return 0;
}