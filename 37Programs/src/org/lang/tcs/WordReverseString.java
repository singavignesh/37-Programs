package org.lang.tcs;

public class WordReverseString {
public static void main(String[] args) {
	String s = "I am going to School";
	String reverse ="";
	String[] split = s.split(" ");
	for(int i=split.length-1; i>=0 ;i--)
	{
		reverse = reverse+" "+split[i];
		
	}
	System.out.println(reverse);
	
}
}
