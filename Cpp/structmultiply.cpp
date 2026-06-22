#include<iostream>
using namespace std;
struct multiplication{
    int n1, n2;
    int multiply(){
    return n1*n2;
}
};
int main(){
    multiplication mul;
    mul.n1 = 10;
    mul.n2 = 2;
    int result = mul.multiply();

    cout<<" The multiplication of "<< mul.n1 <<" and "<< mul.n2 <<" is "<< result <<endl;
    return 0;
}