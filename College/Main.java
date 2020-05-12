#include<iostream>
using namespace std;
int main()
{
  //Type your code here.Enter the number of colleges
cout<<"Enter the number of colleges"<<endl;
  int n;
  cin>>n;
  for(int i = 0 ;i < n ;i++)
  {
  	cout<<"Enter the details of college "<<1+i<<endl;
    cout<<"Enter name"<<endl; 
	cout<<"Enter city"<<endl;
	cout<<"Enter year of establishment"<<endl;
	cout<<"Enter pass percentage"<<endl;
  }
  cout<<"Details of colleges"<<endl;
  for(int i = 0 ;i < n ;i++)
  {
  	string name,city;int year;float pc;
    cout<<"College:"<<1+i<<endl;
    cin>>name>>city>>year>>pc;
    cout<<"Name:"<<name<<endl;
cout<<"City:"<<city<<endl;
cout<<"Year of establishment:"<<year<<endl;
cout<<"Pass percentage:"<<pc<<endl;
  }
}