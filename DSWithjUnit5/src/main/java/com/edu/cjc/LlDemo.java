package com.edu.cjc;

import java.util.ArrayList;
import java.util.List;

public class LlDemo {
	
	public static void zerosToStart(List<Integer> arrList) {
        List<Integer> nwList = new ArrayList<>();
		int j=0;
		for(int i=0;i<arrList.size();i++) {
			
			if(arrList.get(i)==0) {
				nwList.add(0, arrList.get(i));
			} else {
				nwList.add(arrList.get(i));
			}
		}
		System.out.println(nwList);
    }

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(0);
		arrList.add(20);
		arrList.add(4);
		arrList.add(0);
		arrList.add(0);
		arrList.add(9);
		System.out.println(arrList);
		zerosToStart(arrList);
		
		

	}

}
