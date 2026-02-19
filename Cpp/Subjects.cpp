#include<iostream>
using namespace std;

class students_detail
{
    protected:
    int rno , sum=0 ,marks[5];

    public:
    void detail()
    {
        cout<<"Enter the roll no:"<<endl;
        cin>>rno;

        cout<<"Enter the marks of five students:"<<endl;
        for(int i=1;i<=5;i++){
            sum=sum+marks[i];
        }
    }
};
class sport_mark
{
    protected:
    int s_mark;
    public:
    void get_mark()
    {
    cout<<"enter the sports marks"<<endl;
    cin>>s_mark;
    }    
};
class result: public students_detail, public sport_mark  
{  
    int tot, avg;  
    public:   
        void disp ()  
        {  
            tot = sum + s_mark;  
            avg = tot / 6; // total marks of six subject / 6  
            cout << " \n \n \t Roll No: " << rno << " \n \t Total: " << tot << endl;  
            cout << " \n \t Average Marks: " << avg;  
        }  
};  
  
int main ()  
{  
    result obj; 

    obj.detail();  
    obj.get_mark();  
    obj.disp();  
}  