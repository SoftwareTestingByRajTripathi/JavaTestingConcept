package string;

public class ReverseString {
	public static void main(String[] args) {
		String orinalstr ="ExtramarksEducationIndiaPvtLtd";  
		//Store reverse string//
		String revserstr = "";
		//Iterate through the orinalstr from last and add each character to variable reversstr// 
		for(int i =orinalstr.length()-1;i>=0;i-- )
		{
			revserstr= revserstr + orinalstr.charAt(i);
		}
		System.out.println("Orignal String: "+orinalstr);
		//display the reverse string 
		System.out.println("Reverse String: "+revserstr);
	}

}
