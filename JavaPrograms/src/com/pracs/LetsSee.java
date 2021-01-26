package com.pracs;

public class LetsSee {

	public static void main(String[] args) {
	
		Display obj=new Display();
		//obj.show(3,5,6,7,8,9);
		obj.show(5);

		

	}

}

class Display
{
	public void show(int ... a)
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	
	public void show(int a)
	{
		System.out.println(a +" a is show");
	}
	
}
