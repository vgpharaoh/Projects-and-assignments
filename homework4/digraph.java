package homework4;

import java.util.LinkedList;

public class digraph {
	//To Do
	public final int V;
	private linkedlist[] adj;
	public digraph(int n) {
		//To Do
		this.V = n;
		adj =  new linkedlist[V];
		for(int v=0; v<V; v++)
			adj[v] = new linkedlist();
	}
	public void addEdge(int source, int target) {
		//To Do
		adj[source].insert(target);
	}
	
	public Iterable<Integer> adj(int v){
		//To Do
		return adj[v];
	}
	
}
