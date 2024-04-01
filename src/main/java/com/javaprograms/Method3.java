package com.javaprograms;

public class Method3 {
	//multiply of 2 numbers and return the multiply value (result back to caller) 
	public static int mul(int a, int b)
	{
		int mult=a*b;
		System.out.println(mult);
		return mult;
	}
	public static void main(String[] args) {
		
		mul(2,8);
		mul(8,7);

	}

}
