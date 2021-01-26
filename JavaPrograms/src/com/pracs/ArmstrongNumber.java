package com.pracs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=153;
		int r,s=0;
		int temp=n;
		
		while(n>0)
		{
		r=n%10;
		n=n/10;
		s=s+r*r*r;
		}
		
		if(temp==s)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}

	}

}
