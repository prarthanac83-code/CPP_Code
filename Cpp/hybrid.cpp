#include<iostream>
using namespace std;
class Vehicle{
    public:Vehicle(){
        cout<<"This is a vehicle"<<endl;
    }
};
class Car:public Vehicle{
    public:Car(){
        cout<<"This is a car"<<endl;
    }
};
class Racing{
    public:Racing(){
        cout<<"This is for racing"<<endl;
    }
};
class Ferrari:public Car,public Racing{
    public:Ferrari(){
        cout<<"Ferrari is a racing car"<<endl;
    }
};
int main(){
    Ferrari f;
}