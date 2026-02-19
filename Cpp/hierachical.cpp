#include<iostream>
using namespace std;
class A{
    protected:
    int x,y;
    public:A(){
        cout<<"enter the value of x and y:"<<endl;
        cin>>x>>y;
    }
};
class B:public A{
    public:B(){
        cout<<"Product="<<x*y<<endl;
    }
};
class C:public A{
    public:C(){
        cout<<"sum="<<x+y<<endl;
    }
};
int main(){
    B obj1; 
    C obj2; 
}