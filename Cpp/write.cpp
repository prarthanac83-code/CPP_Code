#include<iostream>
#include<fstream>
using namespace std;
int main(){
    ofstream filestream("testout.txt");
    if(filestream.is_open()){
        filestream<<"Java"<<endl;
        filestream<<"Python"<<endl;
        filestream.close();
    }else{
    cout<<"file opening is fail"<<endl;
    }
}