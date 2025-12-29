#include<iostream>
using namespace std;
class Tpoint{
    public:
        void Multiplication(int x,int y){
            cout<<"result:"<<x*y<<endl;
        }
        void Multiplication(double x,double y){
            cout<<"result:"<<x*y<<endl;
        }    
};
int main(){
    Tpoint obj;
    obj.Multiplication(12,5);
    obj.Multiplication(12.5,2.5);
}
