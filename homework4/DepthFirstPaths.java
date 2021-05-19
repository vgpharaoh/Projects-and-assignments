package homework4;

public class DepthFirstPaths {
	//To Do
	// Initialize instance variables
	private boolean[] marked;
	private int[] edgeTo;
	private int s;
	
	public DepthFirstPaths(digraph dg, int i) {
		// To Do
		//constructor
		marked = new boolean[dg.V];
		edgeTo = new int[dg.V];
		s = i;
		dfs(dg, i);
	}
	
	private void dfs(digraph dg, int v) {
		//To Do
		//	dfs algorithm
		marked[v] = true;
		for (int w: dg.adj(v))
			if(!marked[w])
			{
				edgeTo[w] = v;
				dfs(dg, w);
			}
	}
	
	public boolean hasPathTo(int t) {
		//To Do
		// modify this to return true or false based on if a path exists between the source vertex s and the given target vertex t. 
		return marked[t];
	}
	public stack pathTo(int t){
		//To Do
		if(!hasPathTo(t)) return null; 
		stack path = new stack(); 
		for (int x = t; x!= s; x = edgeTo[x])
			path.push(x);
//		path.push(s);
		return path;
	}
}
