//Function Overriding
#include<iostream>
using namespace std;
class Shape{
    public:
    virtual void draw(){
        cout<<"Drawing!"<<endl;
    }
};
class Rectangle:public Shape{
    public:
    void draw(){
        cout<<"Drawing Rectangle!"<<endl;
    }
};
class Circle:public Shape{
    public:
    void draw(){
        cout<<"Drawing Cirlce!"<<endl;
    }
};
int main(){
        Shape *s;

    Shape sh;
    Rectangle rect;
    Circle circ;
    
    s=&sh;      
    s->draw();

    s=&rect;      
    s->draw(); 

    s=&circ;  
    s->draw();    
}