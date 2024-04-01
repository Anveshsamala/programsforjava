package com.javaprograms;

public class Logic1 {

	public static void main(String[] args) {
		//display their sum unless the two values are same, then display double their sum.
		int num1=2;
		int num2=2;
		if(num1==num2)
		{
			int num3=2*(num1+num2);
			System.out.println(num3);
		}
		else
		{
			int num4=num1+num2;
			System.out.println(num4);
		}

	}

}
