package inheritance;

public class BobyDog extends Dog1{
	void weep()
	{
		System.out.println("Bobydog weeping");
	}
public static void main(String[] args) {
	BobyDog b1 = new BobyDog();
	b1.eat1();
	b1.braking();
	b1.weep();
	
}
}
