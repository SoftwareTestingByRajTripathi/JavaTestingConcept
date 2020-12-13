package interfacepkg;

public class Animal3 implements Animal,Animal2
{
 public void run ()
 {
	 System.out.println("Horse runing");
 }
 public void brak()
 {
	 System.out.println("Dogs Braking");
 }
 public static void main(String[] args) {
	Animal3 an = new Animal3();
	an.run();
	an.brak();
}
}
