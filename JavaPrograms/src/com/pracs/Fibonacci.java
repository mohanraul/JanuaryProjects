package com.pracs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int k = 0;
		int a=1,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.print("1 1 ");
		while(k<=n)
		{
			k=a+b;
			if(k>=n)
				break;
			System.out.print(k +" ");
			a=b;
			b=k;
			
		}

	}

}
