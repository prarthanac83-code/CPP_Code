#include<iostream>
using namespace std;
void change (int data);
int main(){
    int data = 8;
    change(data);
    cout<<"the value of data is:"<<data<<endl;
    return 0;
}
void change(int data){
    data = 6;
}