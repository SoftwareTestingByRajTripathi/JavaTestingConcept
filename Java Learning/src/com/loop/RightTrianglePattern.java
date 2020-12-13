package com.loop;

public class RightTrianglePattern {
	public static void main(String[] args) {
	
		//i for rows and j for column//
		//outer loop//
		for (int i=0;i<=6;i++)
		{
			//inner loop//
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}

		System.out.println();
		}

}
}