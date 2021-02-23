package org.lang.tcs;

public class PalindromeNumbers {
	public static void main(String[] args) {
		int a = 978;
		int b = a;
		int reverse = 0;
		
		while(a>0) {
			reverse = reverse*10+a%10;
			a = a/10;
		}
			if(b==reverse) {
				System.out.println("palidrome");
			}
			
				else { 
					System.out.println("not");
				}
					
			}
				
		}


	