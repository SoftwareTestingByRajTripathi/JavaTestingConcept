package keyword;

public class This2 {
	int rollno;  
	String name;  
	float fee;  
	This2(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
	public static void main(String args[])
	{  
		This2 s1=new This2(111,"ankit",5000f);  
		This2 s2=new This2(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	}}  

