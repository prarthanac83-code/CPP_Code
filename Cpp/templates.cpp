#include<iostream>
using namespace std;
template<class T> T add(T&a,T&b)
{
    T result=a+b;
    return result;
}
int main(){
    int i =4;
    int j =6;
    float m =1.5;
    float n =3.5;
    
    cout<<"Addition of i and j is"<<add(i,j)<<endl;
    cout<<"Addition of m and n id"<<add(m,n)<<endl;
    }
  
