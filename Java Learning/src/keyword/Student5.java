package keyword;

public class Student5 {
	int rollnum;
	String name,course;
	float fee;
	Student5(int rollnum,String name,String course){  
		this.rollnum=rollnum;  
		this.name=name;  
		this.course=course; 
	}
	Student5(int rollnum,String name,String course,float fee)
	{  
		this(rollnum,name,course);//reusing constructor  
		this.fee=fee;

	}
	void display()
	{
		System.out.println(rollnum+" "+name+" "+course);
	}
	
	void display1()
	{
		System.out.println(rollnum+" "+name+" "+course+" "+fee);
	}
public static void main(String[] args) {
	
	Student5 s1 = new Student5(12,"Raj","Java");
	Student5 s2 = new Student5 (13,"Shrishti","testing",3400f);
	s1.display();
	s2.display1();
}}
