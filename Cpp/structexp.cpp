#include<iostream>
using namespace std;
struct Student{
    string first_name;
    string last_name;
    int age;
    float grade;
};
int main(){
    Student student1;
    student1.first_name = "Alice";
    student1.last_name = "Joans";
    student1.age = 20;
    student1.grade = 90.9;

    cout<<"The First name is:"<<student1.first_name<<endl;
    cout<<"The Last name is:"<<student1.last_name<<endl;
    cout<<"The age is:"<<student1.age<<endl;
    cout<<"The grade is:"<<student1.grade<<endl;
}
//tomorrow multiplication example