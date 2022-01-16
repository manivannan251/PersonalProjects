package com.udemy.hb.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String label;
	
	private List<Vertex> adjacenyList;
	
	public Vertex(String name) {
		label = name;
		adjacenyList = new ArrayList<Vertex>();
	}
	
	public void addNeighbour(Vertex v) {
		adjacenyList.add(v);
	}
	
	public void showNeighbours() {
		for(Vertex v: adjacenyList)
			System.out.println(v);
	}

	@Override
	public String toString() {
		return "Vertex [label=" + label + "]";
	}
	
	
}
