package inheritance;

public class Shristi extends Student {
	void read1()
	{
		System.out.println("Shristi is reading JAVA");
	}
	void learn1()
	{
		System.out.println("Shrishti learn java");
		System.out.println("Alka learn C");
	}
	public static void main(String[] args) {
		
		Shristi s1 = new Shristi();
		s1.read();
		s1.read1();
		s1.learn();
		s1.learn1();
	}

}
