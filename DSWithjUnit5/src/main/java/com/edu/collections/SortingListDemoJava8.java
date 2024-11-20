package com.edu.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListDemoJava8 {

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
        List<Integer> sortedList = list.stream()
                .sorted().collect(Collectors.toList());
        System.out.println("After sorting");
        System.out.println(sortedList);
        System.out.println("In reverse order");
        List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(reverseOrder);
    }
}
