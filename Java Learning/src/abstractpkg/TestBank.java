package abstractpkg;

public class TestBank {
	public static void main(String[] args) {
		Bank b;
		b= new SBI();
		System.out.println("Rate of Interset SBI :"+b.rateofinterest());
		b= new PNB();
		System.out.println("Rate of interset PNB: " +b.rateofinterest());
		b= new IDB();
		System.out.println("Rate of interset IDB : " +b.rateofinterest());
	}

}
