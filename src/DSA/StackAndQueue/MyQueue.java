package DSA.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);       // queue = [10]
        queue.offer(20);     // queue = [10, 20]
        System.out.println(queue.size());  // 2

        queue.add(52);       // queue = [10, 20, 52]
        queue.add(48);       // queue = [10, 20, 52, 48]
        queue.add(78);       // queue = [10, 20, 52, 48, 78]
        queue.add(64);       // queue = [10, 20, 52, 48, 78, 64]
        queue.add(35);       // queue = [10, 20, 52, 48, 78, 64, 35]

        System.out.println(queue.element());  // 10  (head, but not removed)
        System.out.println(queue.poll());     // 10  (head, removed)
        System.out.println(queue.size());     // 6   (since 10 is gone)
        System.out.println(queue.peek());     // 20  (head, but not removed)
        System.out.println(queue.remove());     // 10  (head, removed)
    }
}