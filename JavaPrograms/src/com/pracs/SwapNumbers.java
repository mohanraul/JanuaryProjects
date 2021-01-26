package com.pracs;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a=4;
		int b=5;
		int k=0;
		/*
		 * k=b; b=a; a=k;
		 */
		
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */
		
		/*
		 * a=a^b; b=a^b; a=a^b;
		 * 
		 * System.out.println(a+" is a" ); System.out.println(b+" is b");
		 */
		
		b=a+b -(a=b);
		System.out.println(a);
		System.out.println(b);
	}

}
