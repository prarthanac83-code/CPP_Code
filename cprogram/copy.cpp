#include<iostream>
using namespace std;
class Product{
    public:
    int price;
    Product(int Pro)
    {
        price=Pro;
    }
    Product(const Product &item)
    {
        price=item.price;
    }
};
    int main(){
        Product p1(500);
        Product p2(p1);
    
    cout << "Price of copied product: " << p2.price; 
    }