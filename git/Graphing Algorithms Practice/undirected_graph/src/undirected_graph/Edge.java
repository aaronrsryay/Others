package undirected_graph;

public class Edge{
    private int go_to;
    private int cost;
    public Edge(int V, int cost){
    	go_to=V;
        this.cost=cost;
    }
    public int get_Vertex(){
    	return go_to;
    }
    public int get_cost(){
    	return cost;
    }
    public void change_cost(int cost){
    	this.cost=cost;
    }
}