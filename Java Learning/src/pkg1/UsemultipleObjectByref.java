package pkg1;

public class UsemultipleObjectByref {
	 int id;  
	 String name;   
	 public static void main(String args[]){  
	  //Creating objects  
		 UsemultipleObjectByref s1=new UsemultipleObjectByref();  
		 UsemultipleObjectByref s2=new UsemultipleObjectByref();  
	  //Initializing objects  
	  s1.id=12;  
	  s1.name="Shrishti";  
	  s2.id=13;  
	  s2.name="Amit";  
	  //Printing data  
	  System.out.println(s1.id+" "+s1.name);  
	  System.out.println(s2.id+" "+s2.name);  
	 }  
	}  

