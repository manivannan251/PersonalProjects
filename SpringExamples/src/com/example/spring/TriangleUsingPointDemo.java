package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TriangleUsingPointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		TriangleUsingPoint triangleUsingPoint = (TriangleUsingPoint) context.getBean("triangleUsingPoint");
		triangleUsingPoint.draw();
		Object obj = new Object();

	}

}
