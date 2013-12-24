package prep.graph;

public class GraphTest {
	public static void main(String[] args) {
		GraphUsingInt graph = new GraphUsingInt(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.BFS(graph, 0);
	}

}
