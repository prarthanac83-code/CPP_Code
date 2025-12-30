//operator overloading
#include<iostream>
using namespace std;
class Fract{
    private:
    int a1;
    int b1;
    public:
    Fract():a1(0),b1(0){}
    void in(){
        cout<<"enter the numerator"<<endl;
        cin>>a1;
        cout<<"enter the denominator"<<endl;
        cin>>b1;
    }
    Fract operator *(const Fract &obj){
    Fract tem;
    tem.a1=a1*obj.a1;
    tem.b1=b1*obj.b1;
    return tem;         
}
    void out(){
        cout<<"the fraction is:"<<a1<<"/"<<b1;
    }
};
int main(){
    Fract Fa1,Fb1,res;
    cout<<"enter the first num:"<<endl;
    Fa1.in();
    cout<<"enter the second num:"<<endl;
    Fb1.in();

    res = Fa1 * Fb1;  
    res.out(); 
}