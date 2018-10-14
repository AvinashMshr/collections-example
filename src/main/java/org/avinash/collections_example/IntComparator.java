package org.avinash.collections_example;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer>{
	public int compare(Integer obj1, Integer obj2) {
		//Integer I1 = (Integer)obj1;
		//Integer I2 = (Integer)obj2;
		return -obj1.compareTo(obj2);
		//return +1;
		
//		if(I1 < I2) {
//			return +1;
//		}else if(I2 < I1) {
//			return -1;
//		}else {
//			return 0;
//		}
	}

}
