package org.lang.tcs;

public class Decending {
	public static void main(String[] args) {
		int a[]= {02,04,26,11,12,16,64,92};
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
				
			}
		    for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("largest number:" +a[0]);
		System.out.println("least number:" + a[a.length-1]);
		
	}
}
