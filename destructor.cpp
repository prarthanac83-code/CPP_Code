#include<iostream>
using namespace std;
class employee
{
    public:
    employee()
    {
        cout<<"constructor invoke"<<endl;
    }
    ~employee()
    {
        cout<<"destructor invoke"<<endl;
    }
};
int main(void){
    employee e1;
    employee e2;
}