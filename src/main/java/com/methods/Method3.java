package com.methods;

public class Method3 {
	int a=90;
	public void start()
	{
		System.out.println("Non-static method ");
	}

	public static void main(String[] args) {
		
		System.out.println(new Method3().a);
		new Method3().start();

	}

}
