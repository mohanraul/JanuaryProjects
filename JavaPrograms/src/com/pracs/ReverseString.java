package com.pracs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium";
		
		//1 way
		int len=s.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
		//2 way
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());

	}

}
