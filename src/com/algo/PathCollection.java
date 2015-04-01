package com.algo;

public class PathCollection {
	
	private int aVertex;
	private int aLength;
	
	
	PathCollection(int v, int l){
		
		this.aVertex = v;
		this.aLength=l;
	}
	
	public int GetVertex(){
		
		return this.aVertex;
		
	}
	public int GetLength(){
		
		return this.aLength;
		
	}

}
