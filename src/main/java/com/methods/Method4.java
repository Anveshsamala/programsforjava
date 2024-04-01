package com.methods;

public class Method4 {
	
	int a=87;
	public void end()
	{
		System.out.println("both same class and different class");
	}

	public static void main(String[] args) {
		
		//same class
		System.out.println(new Method4().a);
		new Method4().end();
		
		//different class
		System.out.println(new Method3().a);
		new Method3().start();
		
		//reintialization
		new Method3().a=99;
		System.out.println(new Method3().a);
		
		Method3 aaa=new Method3();
		System.out.println(aaa.a);
		
		aaa.a=777;
		Method3 bb=aaa;
		
		System.out.println(aaa.a);
		System.out.println(bb.a);

	}

}
