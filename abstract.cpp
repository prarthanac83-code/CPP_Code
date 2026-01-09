//Abstract Base class
#include<iostream>
using namespace std;
class shape{
    public:
    virtual void draw()=0;   
};
class rectangle : public shape{
    public:
    void draw(){
        cout<<"drawing a rectangle"<<endl;
    }
};
class circle : public shape{
    public:
    void draw(){
        cout<<"drawing a circle"<<endl;
    }
};
int main(){
    rectangle rect;
    circle circ;
    rect.draw();
    circ.draw();
};