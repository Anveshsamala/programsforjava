package com.javaprograms;

public class RecuNumbers1 {
	
	//dislay numbers like 98765432123456789
	 public static void numbersdescorder(int a)
	 {
		 if(a>=1)
		 {
			 System.out.print(a);
			 --a;
			 numbersdescorder(a);
		 }
	 }
	 
	 public static void numberasceorder(int b)
	 {
		 if(b<10)
		 {
			 System.out.print(b);
			 b++;
			 numberasceorder(b);
		 }
	 }
	 
	 public static void main(String[] args) {
		
		 RecuNumbers1 rec2=new RecuNumbers1();
		 rec2.numbersdescorder(9);
		 rec2.numberasceorder(2);
	}

}
