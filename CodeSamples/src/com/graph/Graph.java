package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	
	private int V;
	
	private LinkedList<Integer> adj[];
	
	
	public Graph(int v){
		this.V=v;
		adj =new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]= new LinkedList<>();
		}
	}
	
	public void addEdge(int v,int w){
		adj[v].add(w);
	}
	 
	public void DFS(int s){
	  
		boolean[] visited= new boolean[V];
		DFSUtil(s,visited);
		
	}
	
	private void DFSUtil(int s, boolean[] visited) {
		
        visited[s]=true;
        System.out.println(s+" ");
        
        Iterator<Integer> itr= adj[s].listIterator();
        
        while(itr.hasNext()){
        	int n=itr.next();
        	if(!visited[n]){
        		DFSUtil(n,visited);
        	}
        }
		
	}

	public static void main(String[] args) {
		
		Graph g= new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

		
		g.DFS(2);
		
	}

}
