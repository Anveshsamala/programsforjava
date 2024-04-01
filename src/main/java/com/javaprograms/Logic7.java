package com.javaprograms;

public class Logic7 {

	public static void main(String[] args) {
		
		// divide 2 numbers without using division operator
		
		int num=40;
		int div=5;
		int count=0;
		while(num>=div)
		{
			num=num-div;
			count++;
		}
		System.out.println(count);
	}

}
