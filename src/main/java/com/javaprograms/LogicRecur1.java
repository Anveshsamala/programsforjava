package com.javaprograms;

public class LogicRecur1 {
	// display 12345678910
	public void let(int a)
	{
		if(a<=10)
		{
			System.out.println(a);
			a++;
			let(a);
		}
	}
	public static void main(String[] args) {

		LogicRecur1 r1=new LogicRecur1();
		r1.let(1);

	}

}
