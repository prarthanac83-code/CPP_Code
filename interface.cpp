#include<iostream>
using namespace std;
class Payment{
    public:
    virtual void pay(double amount)=0;
    virtual ~Payment(){}
};
class creditcard : public Payment{
    public:
    void pay(double amount)override{
        cout<<"Paid$ "<<amount<<" using credit card"<<endl;
    }
};
class UPI : public Payment{
    public:
    void pay(double amount)override{
        cout<<"Paid$ "<<amount<<" using UPI"<<endl;
    }
};
int main(){
    Payment* p1 = new creditcard();
    Payment* p2 = new UPI();
    p1->pay(250.50);
    p2->pay(100.00);

    delete p1;
    delete p2;
}