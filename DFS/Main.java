package dfs;



public class Main {

	public static void main(String[] args) {
	
		Graph graph = new Graph(7);
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 6);


        System.out.println("Depth-First Search (DFS) traversal starting from vertex 0:");
        graph.DFS(0);
	}

}

