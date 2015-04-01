package com.algo;

public class CrossingEdge {
	int v; // this is first vertex in X Array 
	int w; // This is vertex in NOT_X Array.
	int length;
	
	public CrossingEdge(int v, int w, int length){
		
		this.v= v;
		this.w= w;
		this.length = length;
		
	}
	
	public int  GetVertexV(){
		
		return this.v;
		
		
	}
	
	public int GetVertexW(){
		
		return this.w;
		
	}
	
	public int GetLength(){
		
		return this.length;
		
	}
	
	

}
