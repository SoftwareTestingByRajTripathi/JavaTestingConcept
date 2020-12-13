package keyword;

public class This4 {
	This4()
	{
		System.out.println("default cons");
	}
	This4(int x)
	{
		this();
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		This4 cons = new This4(10);
	}

}
