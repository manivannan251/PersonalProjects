package com.example.spring;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		TriangleByType triangleByType = (TriangleByType) context.getBean("trianglebytype");
		triangleByType.draw();
		
		
		TriangleWithConstructor triangleWithConstructor = (TriangleWithConstructor) context.getBean("trianglebyconst");
		triangleWithConstructor.draw();


	}

}
