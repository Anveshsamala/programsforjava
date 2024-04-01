package com.javaprograms;

public class Loop4 {
	public static void main(String[] args) {
		//higher case
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
		}
		//lower case
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch);
		}
		//higher case
		for(char ch=65;ch<=90;ch++)
		{
			System.out.println(ch);
		}
		//lower case
		for(char ch=91;ch<=122;ch++)
		{
			System.out.println(ch);
		}
		
		//alternate alhabets
		for(char ch=97;ch<=122;ch++)
		{
			if(ch%2==1)
			{
				System.out.println("alternative alhabets= "+ch);
			}
		}
		
	}

}
