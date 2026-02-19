#include<iostream>
using namespace std;
class Animal{
    public:Animal(){
    cout<<"It's a Animal"<<endl;
    }
};
class Dog:public Animal{
    public:Dog(){
    cout<<"It's a Dog"<<endl;
    }
};
int main(){
    Dog d;
}

