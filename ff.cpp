#include<iostream>
using namespace std;
class Tpoint{
    private:
    int private_memb;
    protected:
    int protected_memb;
    Tpoint():private_memb(25),protected_memb(50){}
    friend void friendFunction(Tpoint& obj);
};
    void friendFunction(Tpoint& obj){  
    cout << "Accessing Private: " << obj.private_memb << endl;  
    cout << "Accessing Protected: " << obj.protected_memb << endl;  
}  
  
int main() {  
    Tpoint tpoint_object;  
    friendFunction(tpoint_object); 
    return 0;  
}  