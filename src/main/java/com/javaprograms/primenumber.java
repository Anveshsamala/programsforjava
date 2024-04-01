package com.javaprograms;

public class primenumber {

	public static void main(String[] args) {
		
		//prime Number 
		int num=21;
		int count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			count++;
			break;
			}
		}
		if(count==0)
		{
			System.out.println("prime Number");
		}
		else
		{
			System.out.println("it's not a prime Number");
		}

	}

}
