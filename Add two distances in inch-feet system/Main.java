#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float i1,i2,f2,f1;
  cin>>f1>>i1>>f2>>i2;
  
   
  if(i1+i2<12.0)
  cout<<f1+f2<<"'-"<<i1+i2<<(char)34;
  else { 
    float re = i1+i2-12.0;
    cout<<f1+f2+1<<"'-"<<re<<(char)34;
  }
    
}