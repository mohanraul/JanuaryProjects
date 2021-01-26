package com.pracs;

public class RemoveJunkSpecialCharacter {

	public static void main(String[] args) {
		
		String s="$#$##%v$$$sk ills##  09924$@$@89";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
