package com.javaprograms;

public class Method4 {
	public static boolean login(String username, int password)
	{
		if(username=="samalaanvesh@gmail.com" && password==1234)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void perform(boolean r)
	{
		if(r==true)
		{
			System.out.println("Home page dislayed");
		}
		else
		{
			System.out.println("Error message dislayed");
		}
	}

	public static void main(String[] args) {
		
		boolean res1=login("samalarahul@gmail.com",1234);
		perform(res1);
		boolean res2=login("samalaanvesh@gmail.com",1234);
		perform(res2);
	}

}
