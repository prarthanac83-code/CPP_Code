//getline function
#include<iostream>
#include<string.h>
using namespace std;
int main(){
    string name;
    cout<<"Enter the name:"<<endl;
    getline(cin,name);
    cout<<"\nHello\n"<<name;
}