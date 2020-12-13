package keyword;

public class This3 {
		void m()
		{
	System.out.println("hello m");
	}  
	void n()
		{  
	System.out.println("hello n");  
	//m();//same as this.m()  
	this.m();  
	}  
	public static void main(String args[]){  
	This3 a=new This3();  
	a.n(); 
	}}  



