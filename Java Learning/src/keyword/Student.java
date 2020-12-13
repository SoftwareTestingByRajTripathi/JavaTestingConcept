package keyword;

public class Student {
	//Java Program to demonstrate the use of a static method.  
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	     //static method to change the value of static variable  
	     static void valuechange(){  
	     college = "BBD";  
	     }  
	     //constructor to initialize the variable  
	     Student(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     //method to display values  
	     void display()
	     {
	    	 System.out.println(rollno+" "+name+" "+college);
	    	 }  
	//Test class to create and display the values of object    
	    public static void main(String args[]){  
	    Student.valuechange();//calling change method  
	    //creating objects  
	    Student s1 = new Student(111,"RAJ");  
	    Student s2 = new Student(222,"RAJAN");  
	    Student s3 = new Student(333,"RAJU");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}  

