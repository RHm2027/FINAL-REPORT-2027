package bfs;



import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
		public static void main(String[] args) {
			Graph graph = new Graph(8);
			graph.addEdge(0, 3);
			graph.addEdge(0, 4);
			graph.addEdge(3, 5);
			graph.addEdge(4, 6);
			graph.addEdge(1, 2);
			graph.addEdge(1, 7);
			graph.addEdge(2, 7);


        System.out.println("Breadth-First Search (BFS) traversal starting from vertex 0:");
        graph.BFS(0);
	}

}
