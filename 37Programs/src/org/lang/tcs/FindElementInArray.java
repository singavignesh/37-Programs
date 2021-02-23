package org.lang.tcs;

import java.util.Scanner;

public class FindElementInArray {
	public static void main(String[] args) {
	int a[] = new int[5];
	a[0] = 02;
	a[1] = 11;
	a[2] = 04;
	a[3] = 26;
	a[4] = 28;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
    int int1 = sc.nextInt();
	
	
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]==int1) 
		{
		System.out.println("yes");
		}
			
	}

}

	}