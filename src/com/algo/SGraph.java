package com.algo;

import java.util.ArrayList;

public class SGraph {
	
	ArrayList< ArrayList<PathCollection> > data = null;
	
	public SGraph(int v){
		
		data= new ArrayList<ArrayList<PathCollection>>();
		
		data.add(new ArrayList<PathCollection>());
		
		for(int k=0; k<v;k++){
			
			data.add(new ArrayList<PathCollection>());
			
		}
		
		
		
	}
	
	
	
	public int totalEdges(int v){
		
		ArrayList<PathCollection> edgeRepresented =data.get(v);
		int num_edges = edgeRepresented.size();
				
		return num_edges;
		
	}
	
	public ArrayList<PathCollection> getEdges(int v){
		
		return data.get(v);
	}
	
	public void setEdges(int v, ArrayList<PathCollection> anEdge){
		data.set(v, anEdge);
			
	}
	
	public void setEdges_Array(int v, int[] array)
	{
		
		setEdges(v, AddArrayToArrayList(array));
		
	}
	
	/// to be implemented
	
	private ArrayList<PathCollection> AddArrayToArrayList(int[] arr){
		
	ArrayList<PathCollection> row1 = new ArrayList<>();
	
		for(int i =0; i<arr.length;i++){
		//	row1.add(arr[i]);
			
		}
	
	
	
	return row1;
	
	}

	public void addDirectedEdge(int v, PathCollection m){
		
		ArrayList<PathCollection> allValues =  this.getEdges(v);
		allValues.add(m);
		
	}

	
	
	
	
	
	//	public int RemoveEdge(int v, int edgeElement){
//
//		int totalRemoved =0;
//		ArrayList<Integer> rowElements =   this.data.get(v); //if graph is : 1 | 2   3 then it will return 2 3
//		int indexOfElement =-1;
//		 indexOfElement =  rowElements.indexOf(edgeElement);
//		 while(indexOfElement !=-1){
//			 rowElements.remove(indexOfElement);
//			 totalRemoved++;
//			 indexOfElement =  rowElements.indexOf(edgeElement);
//		 }
//		
//		
//		return totalRemoved;
//		
//	}
	
	/*public void ReplaceElement(int v, int elementToReplace, int withelement){

		
		
		ArrayList<Integer> arrayList = this.data.get(v);
		int indexOfElement =-1;
		
		 indexOfElement =  arrayList.indexOf(elementToReplace);
		while(indexOfElement !=-1){
			arrayList.set(indexOfElement, withelement);
			 indexOfElement =  arrayList.indexOf(elementToReplace);
			
		}
	
		
	}*/
}
