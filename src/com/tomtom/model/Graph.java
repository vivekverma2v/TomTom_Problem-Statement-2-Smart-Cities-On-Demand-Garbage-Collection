package com.tomtom.model;

import java.util.List;
import com.tomtom.model.UserEdge;

public class Graph {
	
    private final List<Vertex> vertexes;
    private final List<UserEdge> edges;

    public Graph(List<Vertex> vertexes, List<UserEdge> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public List<UserEdge> getEdges() {
        return edges;
    }
}