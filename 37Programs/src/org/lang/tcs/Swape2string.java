package org.lang.tcs;

public class Swape2string {
	public static void main(String[] args) {
		String s = "Singavignesh";
		String s1 = "Nithya";
		System.out.println("Before swapping:");
		System.out.println("The value s is:" +s);
		System.out.println("The value s1 is:" +s1);
		s= s+s1;
		s1 = s.substring(0,s.length()-s1.length());
		s = s.substring(s1.length());
		System.out.println("After Swapping");
		System.out.println("The value of s is:" +s);
		System.out.println("The value of s1 is:" +s1);
	}

}


