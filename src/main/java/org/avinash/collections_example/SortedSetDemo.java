package org.avinash.collections_example;

import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedSetDemo {
	
	
	public void show() {
		SortedSet sortedSet = new TreeSet();
		sortedSet.add(3);
		sortedSet.add(10);
		sortedSet.add(5);
		sortedSet.add(1);
		sortedSet.add(15);
		sortedSet.add(8);
		//sortedSet.add(null);
		
		String str = null;
		Integer val = null;
		
		System.out.println(sortedSet);
		System.out.println(sortedSet.headSet(5));
		System.out.println(sortedSet.tailSet(8));
		
		System.out.println(sortedSet.comparator());
		
		System.out.println("Y".compareTo("Z"));
		System.out.println("S".compareTo("B"));
		System.out.println("A".compareTo("A"));
		//System.out.println("A".compareTo(null));
		
		SortedSet sortedSet1 = new TreeSet(new IntComparator());
		sortedSet1.add(3);
		sortedSet1.add(10);
		sortedSet1.add(5);
		sortedSet1.add(1);
		sortedSet1.add(15);
		sortedSet1.add(8);
		System.out.println(sortedSet1);
		
//		Set set = new TreeSet();
//		
//		set.add(new Emp());
//		set.add(new Emp());
		
		
	}

}
