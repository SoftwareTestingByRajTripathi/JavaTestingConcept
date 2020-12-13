package string;

public class tostring {
	
	int rollnum;
	String name;
	String city;
	tostring(int rollnum, String name,String city)
	{
		this.rollnum = rollnum;
		this.name=name;
		this.city=city;
		
	}
	public String toString()
	{
	return rollnum+" "+name+" "+city;  
	}
	public static void main(String[] args) {
		tostring s1 = new tostring(12,"Raj","Rahul");
		tostring s2 = new tostring(13,"Srishti","lohani");
		System.out.println(s1);
		System.out.println(s2);
	}

}
