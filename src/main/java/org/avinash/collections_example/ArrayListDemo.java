package org.avinash.collections_example;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {
	
	public void demo() {
		ArrayList arrayList = new ArrayList();
		System.out.println(arrayList.size());
		Iterator iter = arrayList.iterator();
		ListIterator iter1 = arrayList.listIterator();
		
		for(int i =0;i<11;i++) {
			arrayList.add(i);
			System.out.println(arrayList.size());
		}
		
		System.out.println(arrayList);
		
		
		Vector vector = new Vector();
		for(int i =0;i<10;i++) {
			vector.add(i);
		}
		
		Enumeration enum1 = vector.elements();
		Iterator iter2 = vector.iterator();
		ListIterator vectorList= vector.listIterator();
		
		while(vectorList.hasNext()) {
			System.out.println(vectorList.next());
		}
		System.out.println("Avinash");
		while(vectorList.hasPrevious()) {
			System.out.println(vectorList.previous());
		}
	}
	
	

}
