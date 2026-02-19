#include<iostream>
using namespace std;
class Appliance{
    public:Appliance(){
        cout<<"Appliance is turned on"<<endl;
    }
};
class WashingMachine : public Appliance{
    public:WashingMachine(){
        cout<<"Washing clothes"<<endl;
    }
};
class SmartMc : public WashingMachine{
    public:SmartMc(){
        cout<<"smart control via wifi enables"<<endl;
    }
};
int main(){
    SmartMc s;

}