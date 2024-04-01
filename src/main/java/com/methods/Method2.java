package com.methods;


public class Method2  {

	static int a=7;
	public static void end()
	{
		System.out.println("Static method inside class and outside class");
	}
	public static void main(String[] args) {
		//Inside class
		System.out.println(a);
		end();
		//Outside class
		System.out.println(Method1.a);
		Method1.start();
		//reintialization of variable in other class
		Method1.a=80;
		System.out.println(Method1.a);
		

	}

}
