#include<iostream>
using namespace std;
class Prarthana{
    public:
    void her(){
        cout<<"I'm just a gurl"<<endl;
    }
};
class Pallavi:public Prarthana{
    public:
    void chimu(){
        cout<<"Pallavi is just a bitch"<<endl;
    }
};
int main(){
    Pallavi p;
    p.her();
    p.chimu();

}