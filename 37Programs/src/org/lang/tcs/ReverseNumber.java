package org.lang.tcs;

public class ReverseNumber {
	public static void main(String[] args) {
		int a = 8754;
		int reverse = 0;
		while(a>0) {
			reverse = reverse*10+a%10;
			a = a/10;
				}
		System.out.println(reverse);
		
	}
	



}