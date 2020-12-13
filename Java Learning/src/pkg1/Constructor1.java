package pkg1;

public class Constructor1 {
	public Constructor1()
	{
		System.out.println("default consutrutor");
	}
	public Constructor1(int a)
	{
		System.out.println("1 parameters");
	}
	public Constructor1(int a,int b)
	{
			System.out.println("2 Prameters");
		
	}
	public static void main(String[] args) {
		Constructor1 obj1 = new Constructor1();
		Constructor1 obj2 = new Constructor1();
	
	}
}
