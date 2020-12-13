package string;

public class StringBuffer4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		sb.delete(0,3);
		//sb.deleteCharAt(3);
		System.out.println(sb);
	}

}
