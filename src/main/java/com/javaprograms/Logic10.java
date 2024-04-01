package com.javaprograms;

public class Logic10 {

	public static int big(int a, int b, int c)
	{
		if(a>b&&a>c)
		{
			System.out.println("a is bigger");
			return a;
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is bigger");
			return b;
		}
		else
		{
			System.out.println("c is bigger");
			return c;
		}
			
	}
	public static void main(String[] args) {
		
		big(1,2,3);
		big(5,16,7);
		big(17,8,9);
	}

}
//TNMAS00503530000060422