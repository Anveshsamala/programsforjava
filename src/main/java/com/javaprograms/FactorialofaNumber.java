package com.javaprograms;

public class FactorialofaNumber {

	public static void main(String[] args) {
		
		//find the factorial a given number
		int num=5;
		int out=1;
		for(int n=num;n>1;n--)
		{
			out=out*n;
			System.out.println(out);
		}

	}

}
