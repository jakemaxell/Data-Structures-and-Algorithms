// Graph Object

import java.util.ArrayList;

public class Graph {

    private ArrayList<ArrayList<Integer>> adj;

    public Graph(int size){
        adj = new ArrayList<ArrayList<Integer>>(size);
        for(int x = 0; x < size; x++){
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void printTheGraph(){
        for(int x = 0; x < adj.size(); x++){
            System.out.println("\nList of vertex: " + x);
            System.out.print("[" + x + "]");

            for(int y = 0; y < adj.get(x).size(); y++){
                System.out.print(" --- " + adj.get(x).get(y));
            }

            System.out.println();
        }
    }

}
