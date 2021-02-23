package org.lang.tcs;

public class ArrayDuplicate {
public static void main(String[] args) {
	int a[] = {10,10,20,30,50,50,40};
	
	
	for(int i=0;i<a.length;i++)
		
	{
		int temp=0;
		for(int j=i+1;j<a.length;j++)
		{
			if (a[i]==a[j]) {
				temp++;
				
			}
			
		}
		if (temp>0) {
			System.out.println(a[i]);
		}
		
		
	}
}
}
