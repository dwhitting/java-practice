import java.util.*;

public class Runner {

    void main(String[] args) {




        Vertex<Integer> zeroV = new Vertex<>(0);
        Vertex<Integer> oneV = new Vertex<>(1);
        Vertex<Integer> twoV = new Vertex<>(2);
        Vertex<Integer> threeV = new Vertex<>(3);
        Vertex<Integer> fourV = new Vertex<>(4);
        Edge<Integer> zero_one_edge = new Edge<>(zeroV, oneV, 1);
        Edge<Integer> one_zero_edge = new Edge<>(oneV, zeroV, 2);
        Edge<Integer> zero_two_edge = new Edge<>(zeroV, twoV, 3);
        Edge<Integer> two_zero_edge = new Edge<>(twoV, zeroV, 4);
        Edge<Integer> one_two_edge = new Edge<>(oneV,twoV, 5);
        Edge<Integer> two_one_edge = new Edge<>(twoV, oneV, 6);
        Edge<Integer> one_three_edge = new Edge<>(oneV, threeV, 7);
        Edge<Integer> three_one_edge = new Edge<>(threeV, oneV, 8);
        Edge<Integer> three_four_edge = new Edge<>(threeV, fourV, 9);
        Edge<Integer> four_three_edge = new Edge<>(fourV, threeV, 10);
        Edge<Integer> two_four_edge = new Edge<>(twoV, fourV, 11);
        Edge<Integer> four_tow_edge = new Edge<>(fourV, twoV, 12);

        Set<Vertex<Integer>> vSet = new HashSet<>();
        vSet.add(zeroV);
        vSet.add(oneV);
        vSet.add(twoV);
        vSet.add(threeV);
        vSet.add(fourV);

        Set<Edge<Integer>> eSet = new HashSet<>();
        eSet.add(zero_one_edge);
        eSet.add(one_zero_edge);
        eSet.add(zero_two_edge);
        eSet.add(two_zero_edge);
        eSet.add(one_two_edge);
        eSet.add(two_one_edge);
        eSet.add(one_three_edge);
        eSet.add(three_one_edge);
        eSet.add(three_four_edge);
        eSet.add(four_three_edge);
        eSet.add(two_four_edge);
        eSet.add(four_tow_edge);


        Graph<Integer> theGraph = new Graph<>(vSet, eSet);
        //List<Vertex<Integer>> bfsList = GraphAlgorithms.bfs(fourV, theGraph);
        List<Vertex<Integer>> dfsList = GraphAlgorithms.dfs(zeroV, theGraph);

        for (Vertex<Integer> key : dfsList) {
            System.out.println(key.getData());
        }

    }
}
