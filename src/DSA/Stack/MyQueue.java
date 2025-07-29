package DSA.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.offer(20);
        System.out.println(queue.size());
        queue.add(52);
        queue.add(48);
        queue.add(78);
        queue.add(64);
        queue.add(35);
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.size());



    }
}
