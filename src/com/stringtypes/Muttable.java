package com.stringtypes;

public class Muttable {
	
	public static void main(String[] args) {
		
		String a="Java World";
		String b= "Is Important";
		
		int identityHashCode = System.identityHashCode(a);
		System.out.println(identityHashCode);
		
		int identityHashCode2 = System.identityHashCode(b);
		System.out.println(identityHashCode2);
		
		String concat = a.concat(b);
		System.out.println(concat);
		
		int identityHashCode3 = System.identityHashCode(concat);
		System.out.println(identityHashCode3);
		
		
	}

}
