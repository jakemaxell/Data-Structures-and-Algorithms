// Graph
// 6/10/2022

public class Main {

    public static void main(String[] args){

        int size = 5;
        Graph graph = new Graph(size);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printTheGraph();

    }

}
