package com.ChapterSixteen;

import java.util.PriorityQueue;

//This is to show how the Queue class is implemented
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> queue=new PriorityQueue<>();
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        queue.offer(6.7);
        System.out.println("Polling from queue");
        while(queue.size()>0){
            System.out.printf("%.1f",queue.peek());
           queue.poll();
        }
    }
}
