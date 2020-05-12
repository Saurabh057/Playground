#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c, d;
  cin>>a>>b>>c>>d;
  int to = a / 6;
  cout<<to<<endl;
  float tob = d / 6 + d % 6 * 0.1;
  cout<<tob<<endl;
  float crr = (float) c / tob;
  crr =(int) (crr * 10 + 0.5);
  crr =(float) crr / 10;
  cout<<crr<<endl;
  float trr = (float) b / to;
  trr =(int) (trr * 10 + 0.5);
  trr =(float) trr / 10;
  cout<<trr<<endl;
  if(trr - crr < 0)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  return 0;
}