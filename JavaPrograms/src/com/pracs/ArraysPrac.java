package com.pracs;

import java.util.Random;

public class ArraysPrac {

	public static void main(String[] args) {
		
	/*	
	Random r =new Random();	
	int [] a=new int[10];
	
	for(int i=0;i<a.length;i++)
	{
	a[i]=r.nextInt(50);
	}
	
	try
	{
		System.out.println(a[15]);
	}
	catch(Exception e)
	{
		System.out.println("Maximum Array size is 9");
	}
	
	
	
	for(int i:a)
	{
		System.out.println(i);
	}
	
		*/
	/*	
		int [] a= {5,6,7,8};
		int [] b= {6,7,8,9};
		int [] c= {9,8,7,6};
		
		int [][] p= {
				{5,6,7,8},
				{6,7},
				{9,8,7}
		};*/
		
/*		
		int k[][] =new int[3][];
		k[0]=new int[4];
		k[1]=new int[2];
		k[2]=new int[3];*/
		
		int [][][] d=new int[4][4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int l=0;l<4;l++)
				{
					d[i][j][l]=i+j+l;
				}
			}
		}
		
		
		for(int i[][]: d)
		{
			for(int j[]: i)
			{
				for(int l: j)
				{
					System.out.print(l+" ");
				}
			}
		}
		
		
		
		/*
		 * for(int i[]:p) { for (int j:i) { System.out.print(j+" "); }
		 * System.out.println(" "); }
		 */
		
		/*
		 * for(int i=0;i<4;i++) { System.out.println(a[i]); }
		 */
		
		/*
		 * for(int i=0;i<3;i++) { for(int j=0;j<4;j++) { System.out.print(p[i][j]+" ");
		 * } System.out.println(" "); }
		 */
		
		/*
		 * int [] nums=new int[10]; Random r=new Random(); for(int
		 * i=0;i<nums.length;i++) { nums[i]=r.nextInt(10); }
		 * 
		 * for(int n:nums) { System.out.println(n); }
		 */
	}

}
