class Address{
String city,state,country; 

 public Address(String city,String state,String country){
 this.city = city;
 this.state = state;
 this.country = country;
}
}

class Emp{
    int id;
    String name;
    Address address;

public Emp(int id , String name , Address address){
    this.id = id;
    this.name = name;
    this.address = address;
}

void display(){
    System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
    }
}

public class Aggregation2{
    public static void main(String[] args) {
    Address address1=new Address("Pune","Maharashtra","india");    
    Address address2=new Address("Mumbai","Maharashtra","india");    
    Emp e=new Emp(111,"Alex Uttamram Patil",address1);    
    Emp e2=new Emp(112,"George Sakharam Jadhav",address2);    
        
    e.display();    
    e2.display();          
    }
}