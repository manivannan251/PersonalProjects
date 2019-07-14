package com.example.spring;

public class TriangleByType {
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println("The type of triangle drawn is "+getType());
	}
}
