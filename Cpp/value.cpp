//Pass by value
#include<iostream>
using namespace std;
void Square(int num){
num = num * num ;
}
int main(){
    int x = 5;
    Square(x);
    cout<<"Square of the number is :"<<x <<endl;
}
