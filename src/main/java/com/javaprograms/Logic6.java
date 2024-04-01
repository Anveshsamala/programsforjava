package com.javaprograms;

public class Logic6 {

	public static void main(String[] args) {
		
		//find number of digits in a given number
		int num=1650;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
