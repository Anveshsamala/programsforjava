package com.methods;

public class Method1 {
	
	static int a=10;
	public static void start()
	{
		System.out.println("Static method in same class");
	}

	public static void main(String[] args) {
		//Access static members of same class
		System.out.println(a);
		start();
		

	}

}
