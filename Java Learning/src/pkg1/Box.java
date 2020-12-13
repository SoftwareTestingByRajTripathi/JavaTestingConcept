package pkg1;

public class Box {
	double width;
	double height;
	double depth;
	//static double vol;
	Box(){
		System.out.println("Condtructing box");
		width = 10;
		height = 10;
		depth = 10;
		
	}
	double volume(){
		return width * height * depth;
		
	}
	public static void main(String[] args) {
		Box mybox1 = new Box();
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume is "+vol);
	}

}
