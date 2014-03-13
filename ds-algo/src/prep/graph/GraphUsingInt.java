package prep.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GraphUsingInt {
	private int V;
	private Vector<List<Integer>> adjList;
	private List<Boolean> visited;

	public GraphUsingInt(int V) {
		this.V = V;
		this.adjList = new Vector<List<Integer>>(V);
		this.visited = new ArrayList<Boolean>(V);
	}

	public void addEdge(int i, int j) {
		List<Integer> list = null;
		if (this.adjList.size() == 0) {
			list = new ArrayList<Integer>();

		} else {
			list = this.adjList.get(i);
		}
		list.add(j);
		this.adjList.add(list);
	}

	public void initialize(GraphUsingInt graph) {
		for (int i = 0; i < V; i++) {
			graph.adjList.get(0);
			graph.visited.add(i, false);
		}
	}

	public void BFS(GraphUsingInt graph, int s) {
		List<Integer> queue = new ArrayList<Integer>();
		if (s >= V)
			return;
		initialize(graph);
		graph.visited.add(s, true);
		queue.add(s);
		while (!queue.isEmpty()) {
			int tp = queue.get(0);
			System.out.println(tp);
			for (Integer i : this.adjList.get(tp))
				if (!this.visited.get(i)) {
					this.visited.add(i, true);
					queue.add(i);
				}
		}
	}
}
