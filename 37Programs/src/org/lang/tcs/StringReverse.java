package org.lang.tcs;

public class StringReverse {
	public static void main(String[] args) {
		String s = "Nithya123% 04";
		StringBuffer s1 = new StringBuffer();
		s1.append(s);
		String s2 = "Tamilselvi123% 1989";
		String reverse  = "";
		for (int i= s2.length() - 1; i>=0; i--) {
			char ch = s2.charAt(i);
			reverse = reverse+ch;
		}
		System.out.println(s1.reverse());
		System.out.println(reverse);
	
	}

}
