package com.loop;

public class PraymidPattern {
	public static void main(String[] args) {
		int row=6;
		for (int i=0;i<row;i++)
		{
			//for space
			for (int j=row-i;j>1;j--)
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


