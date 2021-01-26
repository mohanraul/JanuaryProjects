package com.pracs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	   int r,s=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
	  int n=sc.nextInt();
	   int t=n;
	   while(n>0)
	   {
		   r=n%10;
		   n=n/10;
		   s=s*10+r;
	   }
		/*
		 * if(t==s) { System.out.println("Palindrome Number"); } else {
		 * System.out.println("Not a Palindrome"); }
		 */
	   
	   System.out.println(s);

	}

}
