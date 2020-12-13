package polymorphisam;

public class Methodoverloaded2 {
	 int add (int a,int b)
	{
		return a+b;
	}
 int add2 (int a, int b, int c)
{
	return a+b+c;
}
 int add1(int a, int b, int c, int d)
{
	return a+b+c+d;
}
 public static void main(String[] args) {
	 Methodoverloaded2 mo = new Methodoverloaded2();
	 mo.add(12, 14);
	 mo.add2(12,13, 14);
	 mo.add1(12, 34, 45, 46);
}

}
