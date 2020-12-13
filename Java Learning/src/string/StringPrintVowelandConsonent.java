package string;

public class StringPrintVowelandConsonent {
	public static void main(String[] args) {
		int vCount=0,cCount=0;
		String str = "This is very simple santence";
		//Converting entire string to lower case to reduce the comparisons 
		str = str.toLowerCase();
		for (int i =0;i<str.length();i++)
		{
            //Checks whether a character is a vowel    

	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
        //Increments the vowel counter    

		vCount++;
	}
	else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
	{
        //Increments the consonant counter    
cCount++;
	}
		}
	System.out.println("number of vowel:"+vCount);
	System.out.println("number of consonent:"+cCount);
		
		}
		
	}


