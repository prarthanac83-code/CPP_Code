#include<iostream>
using namespace std;
int main(){
    try{
    int age = 15;
        if (age>=18){
            cout<<"You are old enough"<<endl;
        }else{
            throw(age);
        }
    }
        catch (int num){
            cout<<"You must be atleast 18 years old"<<endl;
            cout<<"age is"<<num;
        }
}

// int main(){
//     try{
//     int age = 15;
//         if (age>=18){
//             cout<<"You are old enough"<<endl;
//         }else{
//             throw(age);
//         }
//     }
//         catch (int num){
//             cout<<"You must be atleast 18 years old"<<endl;
//             cout<<"age is"<<num;
//         }
// }