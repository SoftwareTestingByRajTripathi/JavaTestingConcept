package string;

public class StringCount {
	public static void main(String[] args) {
		String string = "all the best";
		int count = 0;
		for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++; 
		}
		System.out.println("Total Number of string:"+count);
	}

}
