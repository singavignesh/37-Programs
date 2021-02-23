package org.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ClassList {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(02);
		li.add(10);
		li.add(26);
		li.add(04);
		li.add(28);
				
  Set<Object> si = new TreeSet<>(li);
   System.out.println(si);
			
	
	

}
}