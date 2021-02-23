package org.lang.tcs;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;
		int arms = 0;
		
		while (number>0) {
			arms = arms*0+number%10;
			number = number/10;
			
		}
			System.out.println(arms);
	}

}
