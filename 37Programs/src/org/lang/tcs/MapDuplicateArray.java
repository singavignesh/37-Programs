package org.lang.tcs;

import java.util.HashMap;
import java.util.Map;

public class MapDuplicateArray {
	public static void main(String[] args) {
		int a[] = {10,10,20,20,40,70,70,80};
		Map<Integer, Integer> mp =new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if (mp.containsKey(a[i])) {
				mp.put(a[i],(mp.get(a[i])+1));
			}
			
			else {
			mp.put(a[i],1);
		}
		}
		System.out.println(mp);
	}

}
