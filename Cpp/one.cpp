#include <iostream>    
using namespace std; //using standard namespace   
class Employee {  //class  
   public:    
       int id; //data member (also instance variable)        
       string name;    
       float salary;    
       Employee(int i, string n, float s)      
        {      
            id = i;      
            name = n;      
            salary = s;    
        }      
       void show()      
        {      
            cout<<id<<"  "<<name<<"  "<<salary<<endl;      
        }      
};    
int main(void) //Main Function  
{    
    Employee emp1 =Employee(201, "John", 650000); //creating an object of Employee     
    Employee emp2=Employee(202, "Alice", 750000);     
    emp1.show();      
    emp2.show();      
    return 0;    
}   