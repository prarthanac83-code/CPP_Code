#include<iostream>
using namespace std;
void fun (double a){
    cout<<"value of a is:"<<a<<endl;
}
void fun(int b){
    if(b%2==0){
        cout<<"even"<<endl;
    }else{
        cout<<"odd"<<endl;
    }
}
int main(){
    fun(4.6);
    fun(3);
}