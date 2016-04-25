package undirected_graph;


import java.io.*;

public class Solution {

    public static void main(String[] args) {
    	/*
	     	3 4
			1 2 1
			1 2 1000
			2 3 3
			1 3 100
			1 3
    	 * 
    	 *
    	 */
    	//System.out.print(System.getProperties());
    	String sample_input="3 4/n1 2 1/n1 2 1000/n2 3 3/n1 3 100/n1 3/n";
    	String[] lines = sample_input.split("/n");
    	String[] indicators= lines[0].split(" ");
    	//System.out.print(indicators[1]);
    	Graph new_graph=new Graph(Integer.parseInt(indicators[0]));
    	for(int count =1; count<Integer.parseInt(indicators[1])+1;count++){
    		String[] values= lines[count].split(" ");
    		//System.out.println(values.length);
    		new_graph.changeoradd_edge(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
    	}
    	String[] toandfrom= lines[lines.length-1].split(" ");
    	System.out.println(new_graph.get_shortest_path_value(Integer.parseInt(toandfrom[0]), Integer.parseInt(toandfrom[1])));
        
    }
}