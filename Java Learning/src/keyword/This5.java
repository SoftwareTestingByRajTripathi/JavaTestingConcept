package keyword;

public class This5 {
	This5()
	{
		this(10);
		System.out.println("default cons");
		
	}
	This5(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		This5 cons1 = new This5();
	}

}
