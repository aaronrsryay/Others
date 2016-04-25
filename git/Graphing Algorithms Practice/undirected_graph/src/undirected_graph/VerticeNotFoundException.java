package undirected_graph;

public class VerticeNotFoundException extends Exception{
	private int node_from;
	private int node_to;
	public VerticeNotFoundException(int node_from, int node_to){
		this.node_from=node_from;
		this.node_to=node_to;
	}

}
