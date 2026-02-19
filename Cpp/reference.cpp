//Pass by reference
#include<iostream>
using namespace std;
void square(int &num){
num = num * num ;
}
int main(){
    int x = 5;
    square(x);
    cout<<"Square of the number is :"<<x <<endl;

} 