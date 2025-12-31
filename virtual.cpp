#include<iostream>
using namespace std;
class Car{
    public:
    virtual void start(){
        cout<<"car is starting"<<endl;
    }
};
class RacingCar : public Car{
    public:
    void start() override{
        cout<<"racing car is starting with a loud roar"<<endl;
    }
};
int main(){
    Car* carPtr;
    RacingCar rc;

    carPtr=&rc;
    carPtr->start();
}