#include<iostream>
using namespace std;
class Employee{
    public:
    string name;
    int id;
    float salary;
    void displayinfo(){
        cout<<"enter the name:"<<name<<endl;
        cout<<"enter the id:"<<id<<endl;
        cout<<"enter the salary:"<<salary<<endl;
}
};
int main(){
    Employee e1;
    e1.name="Aria";
    e1.id=201;
    e1.salary=50000;
e1.displayinfo();
}
