package polymorphisam;

public class Methodoverloadconcept {
	static int add (int a,int b)
	{
		return a+b;
	}
static int add (int a, int b, int c)
{
	return a+b+c;
}
static int add(int a, int b, int c, int d)
{
	return a+b+c+d;
}
 public static void main(String[] args) {
	System.out.println(Methodoverloadconcept.add(12, 13));
	System.out.println(Methodoverloadconcept.add(12,13,14));
	System.out.println(Methodoverloadconcept.add(34, 45, 45, 67));
}
}
