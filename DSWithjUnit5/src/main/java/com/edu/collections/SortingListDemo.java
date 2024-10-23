package com.edu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);
        System.out.println("Before sorting");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println(list);
    }
}
