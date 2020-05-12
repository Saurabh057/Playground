#include <iostream>
using namespace std;
int main() {
  int a;
  int b, c, d, e;
  cin>>a>>b>>c>>d>>e;
  int x, y;
  switch(a) {
    case 1: 
      x = b + d;
      y = c + e;
      if (x == 0)
        cout<<y<<"i";
      else if(y > 0)
      	cout<<x<<"+"<<y<<"i";
      else if(y < 0)
        cout<<x<<y<<"i";
      else
        cout<<x;
      break;
    case 2:
      x = b - d;
      y = c - e;
      if (x == 0)
        cout<<y<<"i";
      else if(y > 0)
      	cout<<x<<"+"<<y<<"i";
      else if(y < 0)
        cout<<x<<y<<"i";
      else
        cout<<x;
      break;
    case 3:
      x = (b * d) - (c * e);
      y = (b * e) + (c * e); // no logic
      if (x == 0)
        cout<<y<<"i";
      else if(y > 0)
      	cout<<x<<"+"<<y<<"i";
      else if(y < 0)
        cout<<x<<y<<"i";
      else
        cout<<x;
      break;
    default:
      cout<<"Invalid choice";
  }
  return 0;
}