package com.pracs;

import java.util.HashSet;

public class DuplicateElements {

	public static void main(String[] args) {
	
		String[] names= {"Python","Java","C#","Ruby",".Net",".Net","Java","C"};
		HashSet<String> h=new HashSet<String>();
		for(String name:names)
		{
		    if(h.add(name)==false) {
                System.out.println("Duplicate element is "+name);
		          
		}
	    
	}

}
}