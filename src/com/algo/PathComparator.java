package com.algo;

import java.util.Comparator;

public class PathComparator implements Comparator<CrossingEdge> {

	@Override
	public int compare(CrossingEdge edge1, CrossingEdge edge2) {
		// TODO Auto-generated method stub
		
		int firstVal = edge1.GetLength();
		int secondVal = edge2.GetLength();
		
		if(firstVal<secondVal) return -1;
		
		if(firstVal>secondVal) return 1;
		
		
		return 0;
	}

	
	
}
