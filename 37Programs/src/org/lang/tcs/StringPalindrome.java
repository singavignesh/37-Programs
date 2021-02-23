package org.lang.tcs;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		StringBuffer sc1 = new StringBuffer();
		
		sc1.append(s);
		StringBuffer reverse = sc1.reverse();
		String string = reverse.toString();
		//System.out.println(reverse);
				if(string.equalsIgnoreCase(s)) {
			System.out.println("yes");
		}
			else {
				System.out.println("not");
			}
						
		}
		   	

}
