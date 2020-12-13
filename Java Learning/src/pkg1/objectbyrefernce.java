package pkg1;

public class objectbyrefernce {
	 int id;  
	 String name; 
	 int rollnum;
	 public static void main(String args[]){  
		 objectbyrefernce s1=new objectbyrefernce();  //s1 is a reference variable//
	  s1.id=10;  
	  s1.name="Raj"; 
	  s1.rollnum= 23;
	  System.out.println(s1.id+" "+s1.name+" "+s1.rollnum);//printing members with a white space  
	 }  

}
