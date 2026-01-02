#include<iostream>
using namespace std;
class rect{
    private:
    int length,breadth;
    public:
    void dimensional(int l,int b) 
    {
        length=l;
        breadth=b;
    }
    int calculatingArea()
    {
        return length*breadth;
    }
    void DisplayDetails()
    {
        cout<<"the length  of the rectangle is:"<<length<<endl;
        cout<<"the breadth  of the rectangle is:"<<breadth<<endl;
        cout<<"the area of the rectangle is:"<<calculatingArea()<<endl;
    }
};
int main(){
    rect rectangle;
    rectangle.dimensional(2.5,3.8);
    rectangle.DisplayDetails();
}