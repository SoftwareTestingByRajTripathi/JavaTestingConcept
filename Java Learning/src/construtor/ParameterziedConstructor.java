package construtor;

public class ParameterziedConstructor {
	int id;  
    String name;  
    //creating a parameterized constructor  
    ParameterziedConstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display()
    {
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    	ParameterziedConstructor p1 = new ParameterziedConstructor(12,"Karan");  
    	ParameterziedConstructor p2 = new ParameterziedConstructor(23,"Raj");  
    //calling method to display the values of object  
    p1.display();  
    p2.display();  
   }  
}  


