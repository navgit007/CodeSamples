package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {

	private int V;
	private LinkedList<Integer>[] adj;

	public BreadthFirstSearch(int V) {
		this.V = V;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public void BFS(int s) {

		boolean[] visited = new boolean[V];

		LinkedList<Integer> queue = new LinkedList<>();

		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {

			s = queue.poll();
			System.out.println(s + " ");

			Iterator<Integer> itr = adj[s].listIterator();

			while (itr.hasNext()) {
				int n = itr.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}

			}

		}

	}

	public static void main(String[] args) {
		BreadthFirstSearch g = new BreadthFirstSearch(9);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.BFS(2);
		
		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

		g.DFS(2);
	}

	public void DFS(int s) {
		boolean[] visited = new boolean[V];
		DFSUtil(s, visited);
	}

	private void DFSUtil(int s, boolean[] visited) {

		visited[s] = true;
		System.out.println(s+" ");
		
		Iterator<Integer> itr= adj[s].listIterator();
		
		while(itr.hasNext()){
			int n=itr.next();
			if(!visited[n]){
				DFSUtil(n, visited);
			}
		}
		
	}

}
