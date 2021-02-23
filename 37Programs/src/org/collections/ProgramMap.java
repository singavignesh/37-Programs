package org.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProgramMap {
	public static void main(String[] args) {
	 Map<Integer, String> map = new HashMap<>();
	 map.put(721183, "Singam");
	 map.put(111201, "Ayyappan");
	 map.put(260264, "Tamil");
	 map.put(920404, "Nithya");
	 map.put(1042465, "Vicky");
	 Set<Entry<Integer,String>> entryset = map.entrySet();
	  for (Entry<Integer, String> entry : entryset) {
		  System.out.println(entry.getKey());
		  System.out.println(entry.getValue());
		  System.out.println(map.get(721183));
	  System.out.println(map.get(111201));
	  System.out.println(map.containsValue("Singam"));
	  System.out.println(map.containsValue("Ayyappan"));
	  System.out.println(map.containsKey(111201));
	  System.out.println(map.containsKey(721183));
	  Set<Integer> keyset = map.keySet();
	  for (Integer key: keyset) {
		  System.out.println(key);
		}
	  Collection<String> value = map.values();
		for (String s : value) {
			System.out.println(s);
		
	  
	}
		  {
			
			}
			
		}
	}
	 	
		
	}
	  
	
	
	 
		


