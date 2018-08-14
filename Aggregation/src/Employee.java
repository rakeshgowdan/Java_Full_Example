public class Employee {  
int id;  
String name;  
address address;  
  
public Employee(int id, String name,address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
address address1=new address("gzb","UP","india");  
address address2=new address("gno","UP","india");  
  
Employee e=new Employee(111,"varun",address1);  
Employee e2=new Employee(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}  