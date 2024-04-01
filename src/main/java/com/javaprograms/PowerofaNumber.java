package com.javaprograms;

public class PowerofaNumber {

	public static void main(String[] args) {
		
		//find the power of a given number
		int num=2;
		int power=3;
		int out=1;
		for(int n=0;n<power;n++)
		{
			out=out*num;
			System.out.println(out);
		}
		

	}

}
