#include<iostream>
using namespace std;
int main(){
    int a,temp;
    cout<<"Enter the the Number";
    cin>>a;
    temp=a;
    while(temp>1){
        temp-=2;
    }
    if(temp==0){
        cout<<"even";
    }else{
        cout<<"odd";
    }
}
