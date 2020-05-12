#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  cout<<"Enter name:"<<endl;
 cout<<"Enter ID:"<<endl;
 cout<<"Enter age:"<<endl;
 cout<<"Enter designation:"<<endl;
 cout<<"Enter Salary:"<<endl;
 cout<<"Employee Details"<<endl;
  struct emp{
    string name,ID,Designation;int Age,Salary;  
  };
  emp e;
  cin>>e.name>>e.ID>>e.Designation>>e.Age>>e.Salary;
  cout<<"Name of the Employee : "<<e.name<<endl; 
cout<<"ID of the Employee : "<<e.ID<<endl;
cout<<"Age of the Employee : "<<e.Designation<<endl;
cout<<"Designation of the Employee : Manager"<<endl;
cout<<"Salary of the Employee : 20000"<<endl;
  
  
}