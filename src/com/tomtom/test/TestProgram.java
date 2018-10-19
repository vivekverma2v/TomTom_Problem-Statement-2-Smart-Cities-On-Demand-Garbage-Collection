package com.tomtom.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.tomtom.algo.ShortestPathAlgo;
import com.tomtom.model.Graph;
import com.tomtom.model.UserEdge;
import com.tomtom.model.Vertex;


public class TestProgram {

    private List<Vertex> nodes;
    private List<UserEdge> edges;

   
    public void testExcute() {
        nodes = new ArrayList<Vertex>();
        edges = new ArrayList<UserEdge>();
        for (int i = 0; i < 11; i++) {
            Vertex location = new Vertex("Loc_" + i, "Loc_" + i);
            nodes.add(location);
        }

        addLane("Edge_0", 0, 1, 85);
        addLane("Edge_1", 0, 2, 217);
        addLane("Edge_2", 0, 4, 173);
        addLane("Edge_3", 2, 6, 186);
        addLane("Edge_4", 2, 7, 103);
        addLane("Edge_5", 3, 7, 183);
        addLane("Edge_6", 5, 8, 250);
        addLane("Edge_7", 8, 9, 84);
        addLane("Edge_8", 7, 9, 167);
        addLane("Edge_9", 4, 9, 502);
        addLane("Edge_10", 9, 10, 40);
        addLane("Edge_11", 1, 10, 600);

        // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edges);
        ShortestPathAlgo dijkstra = new ShortestPathAlgo(graph);
        dijkstra.execute(nodes.get(0));
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(10));

        for (Vertex vertex : path) {
            System.out.println(vertex);
        }

    }

    private void addLane(String laneId, int sourceLocNo, int destLocNo,
            int duration) {
    	UserEdge lane = new UserEdge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration );
        edges.add(lane);
    }
    
    public static void main(String[] args) {
		new TestProgram().testExcute();
	}
}