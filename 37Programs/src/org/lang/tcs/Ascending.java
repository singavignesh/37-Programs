package org.lang.tcs;

import java.util.Arrays;

public class Ascending {
	public static void main(String[] args) {
		int a[] = {26,04,02,11,12,92};
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			
				
					
				}
		}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
				System.out.println("second largest number:" + a[a.length-2]);
				
			}
			
		}
		
		
		//int a[] = {011,87,356,798,898};
		//Arrays.sort(a);
		//for (int i : a) {
		//System.out.println(i);
			
		
		
		//String str[]= {"Singam","Ayyappan","Tamil","Nithya"};
		//Arrays.sort(str);
		//for (String string : str) {
			//System.out.println(string);
			
		//}
			

	


//}
