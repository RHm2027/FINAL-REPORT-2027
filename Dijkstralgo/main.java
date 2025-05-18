package Dijkstralgo;

public class main {
	
	

	    public static void main(String[] args) {
	        int graph[][] = new int[][] {
	        	{ 0, 3, 0, 0, 7, 0, 0, 0, 0 },
	            { 3, 0, 4, 0, 0, 2, 0, 0, 0 },
	            { 0, 4, 0, 5, 0, 0, 1, 0, 0 },
	            { 0, 0, 5, 0, 6, 0, 0, 0, 3 },
	            { 7, 0, 0, 6, 0, 0, 0, 8, 0 },
	            { 0, 2, 0, 0, 0, 0, 4, 0, 0 },
	            { 0, 0, 1, 0, 0, 4, 0, 7, 2 },
	            { 0, 0, 0, 0, 8, 0, 7, 0, 3 },
	            { 0, 0, 0, 3, 0, 0, 2, 3, 0 }
	        };

	        Dijkstra  t = new Dijkstra ();
	        t.dijkstra(graph, 0);
	    }
	}



