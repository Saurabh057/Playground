#include <iostream>
using namespace std;
int main() {
    int n;
  cin>>n;
  
  for(int i = 1 ; i <= n ; i++)
  {
  	if(i%2 == 0)
    {
    	cout<<1+i;
      for(int k = 0; k < n-1; k++)
        cout<<i;
      cout<<endl;
    }
    else
    {
    	for(int j = 0; j < n-1; j++)
          cout<<i;
      	  cout<<i+1<<endl;
    
    }
  
  }
    return 0;
}