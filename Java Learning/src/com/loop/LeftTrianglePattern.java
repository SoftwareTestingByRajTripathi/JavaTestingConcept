package com.loop;

public class LeftTrianglePattern {
	
	public static void main(String[] args) {
		//for rows
		int row=6;
		for (int i=0;i<row;i++)
		{
			//for space
			for (int j=2*(row-i);j>=0;j--)
			{
				
				System.out.print(" ");
			}
			//inner loop 
			for (int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			//throws the cursor in a new line after printing each line  
			System.out.println();
		}
		
	}

}
