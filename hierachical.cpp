#include<iostream>
using namespace std;
class A{
    int x,y;
    public:A(){
        cout<<"enter the value of x and y:"<<endl;
        cin>>x>>y;
    }
};
class B:public A{
    int x,y;
    public:B(){
        cout<<"Product="<<x*y<<endl;
    }
};
class C:public A{
    int x,y;
    public:C(){
        cout<<"sum="<<x+y<<endl;
    }
};
int main(){
    B obj1; 
    C obj2; 
}