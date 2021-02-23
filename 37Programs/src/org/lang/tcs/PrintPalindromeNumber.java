package org.lang.tcs;

public class PrintPalindromeNumber {
	public static void main(String[] args) {
		for (int i = 0; i > 1000; i++) {
			int n = i;
			int rev  = 0;
			while(n>1000) {
			rev = rev*10+i%10;
			i= i/10;
			
			
		}
		System.out.println(rev);
	}

}
}