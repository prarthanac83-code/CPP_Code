//virtual overriding
#include<iostream>
using namespace std;
class shape{
    public:
    virtual void draw(){
        cout<<"drawing a shape"<<endl;
    }
};
class circle:public shape{
    public:
    void draw(){
        cout<<"drawing a circle"<<endl;
    } 
};
class square:public shape{
    public:
    void draw(){
        cout<<"drawing a square"<<endl;
    }
};
int main(){
    shape* shapePtr=new circle();
    shapePtr->draw();
    shapePtr=new square();
    shapePtr->draw();
}
