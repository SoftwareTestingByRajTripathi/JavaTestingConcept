package keyword;

public class This1 {
	int rollno;  
	String name;  
	float fee;  
	This1(int rollno,String name,float fee){  
	rollno=rollno;  
	name=name;  
	fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);
	}  
	public static void main(String args[]){  
		This1 s1=new This1(111,"ankit",5000f);  
		This1 s2=new This1(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	}}  
