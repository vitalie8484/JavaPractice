package com.vitalie.QueueExample;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(50);
        queue.add(100);
        //queue.add(25);

        //Integer i = queue.peek();
        Integer i = queue.poll();
        System.out.println(i);

        //i = queue.peek();
        i = queue.poll();
        System.out.println(i);

        System.out.println(queue);

    }

}
