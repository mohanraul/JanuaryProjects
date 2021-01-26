package com.pracs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s1.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println(num+ " is Prime Number");
		}
		else
		{
			System.out.println(num+ " is Not a prime number");
		}

	}

}
