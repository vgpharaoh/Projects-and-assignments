package homework4;

public class client {
	
	public static void addEdges(digraph dg, String filename) {
		//To Do
		FileOperator f_o = new FileOperator();
		int [][] numbers = f_o.readTerms(filename);
		int size = numbers.length;
		for(int i = 0; i < size; i++)
		{
			dg.addEdge(numbers[i][0], numbers[i][1]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digraph dg = new digraph(6301);
		String filename = "data.txt";
		addEdges(dg, filename);
		int s= 0;
		int t = 127;
		DepthFirstPaths dfs = new DepthFirstPaths(dg,s);
		System.out.println("-----------------------------------------------------------");
		System.out.println("Test 1");
		System.out.println("-----------------------------------------------------------");
		System.out.print("Path exists between 0 and 127 ?");
		boolean ab = dfs.hasPathTo(t);
		System.out.println(ab);
		stack path = dfs.pathTo(t);
		System.out.println("Printing path");
		while(!path.isEmpty())
		{
			System.out.print(path.pop());
			System.out.print("-->");
		}
		System.out.println(t);
		t = 1963;		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Test 2");
		System.out.println("-----------------------------------------------------------");
		System.out.print("Path exists between 0 and 1963 ?");
		ab = dfs.hasPathTo(t);
		System.out.println(ab);
		path = dfs.pathTo(t);
		System.out.println("Printing path");
		while(!path.isEmpty())
		{
			System.out.print(path.pop());
			System.out.print("-->");
		}
		System.out.println(t);
		
		t = 4766;		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Test 3");
		System.out.println("-----------------------------------------------------------");
		System.out.print("Path exists between 0 and 4766 ?");
		ab = dfs.hasPathTo(t);
		System.out.println(ab);
		path = dfs.pathTo(t);
		System.out.println("Printing path");
		while(!path.isEmpty())
		{
			System.out.print(path.pop());
			System.out.print("-->");
		}
		System.out.println(t);
		t = 1000;		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Test 4");
		System.out.println("-----------------------------------------------------------");
		System.out.print("Path exists between 0 and 1000 ?");
		ab = dfs.hasPathTo(t);
		System.out.println(ab);
	}
	
	
}
