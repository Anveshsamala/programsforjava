package com.javaprograms;

public class Logic9 {
	//non-negative int values return true if they have the same last digit
	public static boolean logic(int a, int b)
	{
		if(a%10==b%10)
		{
			System.out.println("Accept");
			return true;
		}
		else
		{
			System.out.println("decline");
			return false;
		}
	}
	public static void main(String[] args) {
		
		logic(15,2550);
		
//		int a=15;
//		int b=255;
//		if(a%10==b%10)
//		{
//			System.out.println(true);
//		}
//		else
//		{
//			System.out.println(false);
//		}
		
	}

}
