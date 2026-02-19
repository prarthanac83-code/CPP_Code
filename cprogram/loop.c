#include<iostream>
using namespace std;
int main(){
    int a,temp;
    cout<<"Enter the the Number";
    cin>>a;
  
    if((a>>1)<<1==a){
        cout<<"even";
    }else{
        cout<<"odd";
    }
}
