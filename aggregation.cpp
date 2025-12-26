#include<iostream>
#include<string.h>
using namespace std;
class Test{
    public:
    int hno;
    string city,state;
    Test(int hno,string city,string state){
        this->hno=hno;
        this->city=city;
        this->state=state;
    }
};
class Address{
    private:
    Test* addr;
    public:
    string name;
    Address(string name,Test* addr)
    {
        this->name=name;
        this->addr=addr;
    }
        void display(){
        cout<<"name"<<name<<"hno:"<<addr->hno<<"city:"<<addr->city<<"state:"<<addr->state<<endl;
    }

};
int main(){
    Test obj1= Test( 45 ,"Los Angeles","USA" );
    Test obj2= Test( 50,"London","Uk");
    Address a1=Address("Kalix",&obj1);
    Address a2=Address("Jack",&obj2);  
    cout<<"Below are the details:"<<endl;
    a1.display();
    a2.display();
}
