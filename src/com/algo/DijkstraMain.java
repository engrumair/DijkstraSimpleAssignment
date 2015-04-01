package com.algo;

import java.util.ArrayList;
import java.util.Collections;

public class DijkstraMain {

	/**
	 * @param args
	 */
	
	static int TOTAL_VERTICES=200;
	static ArrayList<Integer> X = new ArrayList<Integer>();
	static ArrayList<Integer> not_X= new ArrayList<Integer>();
	
//	static int[] vertexAdded;
	
	static ArrayList<Integer> A= new ArrayList<Integer>(); // distances from vertex
	
	static String FILE_ADDRESS =  "G:/assignment5/dijkstraData.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Load Data here
		
		
		SGraph g = new SGraph(TOTAL_VERTICES);
		
		
		In aFile = new In(FILE_ADDRESS);
	
		for(int lineIndex =1; lineIndex< TOTAL_VERTICES+1; lineIndex++ ){
			
		String aLine = aFile.readLine();
		
		String[] separateValues =  aLine.split("\t");
		
		ArrayList<PathCollection> localPC = new ArrayList<PathCollection>();
		
		for(int valuesIndex =1 ; valuesIndex < separateValues.length; valuesIndex++)
		{
			String[] vertexWithLength = separateValues[valuesIndex].split(",");
			
			int edgeVertex = Integer.valueOf(vertexWithLength[0]);
			
			int edgeLength= Integer.valueOf(vertexWithLength[1]);
			
			PathCollection filePathCollection = new PathCollection(edgeVertex, edgeLength);
			
			localPC.add(filePathCollection);
			
		}
		g.setEdges(lineIndex, localPC);
		
		
		
		}
		
		
		///////////////////////////
		
	//	vertexAdded = new int[TOTAL_VERTICES+1];
		
		for(int i=1; i < TOTAL_VERTICES+1; i++){
			
			not_X.add(i);
			
		}
		
		
		
		
		X.add(1); // first of all add starting node to
		not_X.remove((Object)1);
		A.add(0); // shortest distance from vertex '1' to '1' is zero
		
		//vertexAdded[1] =1;
		while(not_X.size()!=1){
			
			ArrayList<CrossingEdge> corssingEdges = new ArrayList<CrossingEdge>();
			
			for(int j=0; j< X.size();j++){
				
				
				int aVertexInX = X.get(j);
				
				int lengthToaVertex= A.get(j);
				
				
				
				ArrayList<PathCollection> pc =    g.getEdges(aVertexInX);
				
				for(int m=0; m< pc.size();m++){
					
					PathCollection aPath =  pc.get(m);
					int crossingVertex = aPath.GetVertex();
					if(not_X.contains(crossingVertex)){
						 
						 corssingEdges.add(new CrossingEdge(aVertexInX, crossingVertex, aPath.GetLength()+lengthToaVertex));
											 
					 }
					
					
				}
							
				
			}
			
			 // sort on the base of distances
			//			java.util.Arrays.sort
			Collections.sort(corssingEdges, new PathComparator());
			
			// Now get the lowest element... if sorted in ascending order then it is the first element of array... 
			
			CrossingEdge minimumLengthEdge=  corssingEdges.get(0);
			
			X.add(minimumLengthEdge.GetVertexW());
			
			A.add(minimumLengthEdge.GetLength());
			
			not_X.remove((Object)minimumLengthEdge.GetVertexW());
			
			corssingEdges.clear();
			
			
			
		}
		
		for(int resultDistIndex =0; resultDistIndex< A.size();resultDistIndex++){
			
			
				System.out.print(X.get(resultDistIndex));
				System.out.print("   ");
				
				System.out.println(A.get(resultDistIndex));
				
			
		}
		
		
		
		
		System.out.println("Completed");
		
		
		
		

	}

}
