package com.javaprograms;

public class FactorialNumberRecur {
	
	public static void num(int a, int out )
	{
		if(a>1)
		{
			out=out*a;
			--a;
			System.out.println(out);
			//System.out.println(a);
			num(a,out);
		}
		
	}

	public static void main(String[] args) {
		
		//FactorialNumberRecur f=new FactorialNumberRecur();
		num(7, 1);

	}

}
