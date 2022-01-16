package com.udemy.hb.graph;
class A {
	
	public void method1() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Inside method1 of A");
	}
}
class B extends A {
	
	@Override
	public void method1() {
		System.out.println("Inside method1 of B");
	}
}
public class AdjacencyMatrixList {
	
	private static int[][] adjacencyMatrix = {
			{0,2,4,0},
			{0,0,0,3},
			{0,0,0,0},
			{0,0,0,0},
			
	};
	
	public static void main(String[] args) {
		for(int i=0;i<adjacencyMatrix.length;i++) {
			for(int j=0;j<adjacencyMatrix.length;j++) {
				if(adjacencyMatrix[i][j]!=0) {
					System.out.println("Edge with weight "+adjacencyMatrix[i][j]);
				}
			}
		}
		
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		
		a.addNeighbour(b);
		a.addNeighbour(c);
		b.addNeighbour(d);
		
		a.showNeighbours();
		b.showNeighbours();
		c.showNeighbours();
		d.showNeighbours();
		

	}

}
