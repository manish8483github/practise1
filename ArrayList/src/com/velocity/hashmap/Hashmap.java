package com.velocity.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "mumbai");
		hm.put(20, "delhi");
		hm.put(30, "pune");

		Set<Integer> s = hm.keySet();
		Iterator<Integer> itr = s.iterator();
		// Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			Integer in = itr.next();
			System.out.println(hm.get(in));
		}
	}
}
