package keyword;

public class StaticExample {
	int rollno;//instance variable  
	   String name;  
	  static String college ="ITS";//static variable  
	   //constructor  
	   StaticExample(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
		   }   
	//Test class to show the values of objects  
	 public static void main(String args[]){  
		 StaticExample s1 = new StaticExample(12,"Raj");  
		 StaticExample s2 = new StaticExample(13,"Alka");
		 StaticExample s3=  new StaticExample(14,"Shrishti");
		 
	 //we can change the college of all objects by the single line of code  
	 //Student.college="BBDIT";  
	 s1.display();  
	 s2.display(); 
	 s3.display();
	 
	 }  
	}  
