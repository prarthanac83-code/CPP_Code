#include<iostream>
using namespace std;
class Base{
    public:
    int x;
};
class Derived:public Base{
    public:
    int y;
};
int main(){
    Derived Tpoint;
    Tpoint.x=10;
    Tpoint.y=15;
    cout<<"Base class value:"<<Tpoint.x<<endl;
    cout<<"Derived class value:"<<Tpoint.y<<endl;
}