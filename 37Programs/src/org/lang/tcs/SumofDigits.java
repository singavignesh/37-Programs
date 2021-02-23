package org.lang.tcs;

public class SumofDigits {
	public static void main(String[] args) {
	int a = 12345;
	int b=0;
	int temp = 0;
	while(a>0) {
		b = a%10;
		temp = temp+b;
		a = a/10;
			
		}
	System.out.println(temp);
			
	}

}
