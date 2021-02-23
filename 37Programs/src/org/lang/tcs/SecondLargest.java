package org.lang.tcs;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int a[] = {2,12,26,04,28};
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
			
		System.out.println(a[a.length-2]);
	}

}
