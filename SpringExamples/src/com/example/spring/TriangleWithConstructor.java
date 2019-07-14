package com.example.spring;

public class TriangleWithConstructor {
	
	public String type;
	
	public int height;
	
	public TriangleWithConstructor(String type,int height) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.height = height;
	}
	
	public TriangleWithConstructor(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
		
	}
	
	public TriangleWithConstructor(int height) {
		// TODO Auto-generated constructor stub
		this.height = height;
		
	}
	
	public void draw() {
		System.out.println("The type of triangle drawn is "+getType()+" with height"+getHeight());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
