package re;

import java.util.Scanner;

public class PalindromSTring {
	public static void main(String[] args) {
		
		System.out.println("Enter The number");
		Scanner s =  new Scanner (System.in);
		
		String b="";
		String a = s.nextLine();
		int n = a.length();
		
		for (int i = n-1; i>=0; i--) {
			b=b+a.charAt(i);
		}
			if (a.equalsIgnoreCase(b)) {
				System.out.println("Palindrom");
				
			}
			else {
				System.out.println("Non Palindrome");
			}
			
		}
	}


