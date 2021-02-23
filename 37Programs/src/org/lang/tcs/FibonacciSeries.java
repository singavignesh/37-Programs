package org.lang.tcs;

public class FibonacciSeries {
	
		public static void main(String[] args) {
			int a = 0;
			int b =1;
			for (int i = 1; i <=10; i++) {
				int third  = a+b;
				a= b;
				b = third;
				
				System.out.println(third);
				if (third==13) {
					break;
					
					
				}
				
				
				
				
			}

		}
		
			
		}