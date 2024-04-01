package com.javaprograms;

import java.util.Scanner;

public class Scanner1 {

	//scanner class
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int value");
		int a=sc.nextInt();
		System.out.println("a= "+a);
		System.out.println("Enter double value");
		double d=sc.nextDouble();
		System.out.println("d= "+d);
		System.out.println("Enter String value");
		String s=sc.next();
		System.out.println("s= "+s);
	}

}
