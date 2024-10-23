package com.edu.ds.stacks_and_queues;

public class GenBinary {

    public static String[] generateBinary(int n) {
        String result[] = new String[n];
        Queue<String> stringQueue = new Queue<>(n*3);
        stringQueue.enqueue("1");
        for (int i=0;i<n;i++) {
            String temp = stringQueue.deque();
            String s1 = temp+"0";
            String s2 = temp+"1";
            stringQueue.enqueue(s1);
            stringQueue.enqueue(s2);
        }
        return result;
    }
}
