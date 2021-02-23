package org.lang.tcs;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		  Integer s= sc.nextInt();
		  Integer c = s;
		    int reverse = 0;
	while(s>0) {
		reverse = reverse*10+s%10;
		s = s/10;
	}
	if(c==reverse) {
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
	

}
}
