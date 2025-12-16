package DSA.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //not threadsafe, insertion deletion from both end, faster than queue
        // Trees, DFS and BFS
        deque.add(12);
        deque.addLast(32);
        System.out.println(deque.removeFirst());
        System.out.println(deque.size());

        // TODO: For more https://youtu.be/rHQI4mrJ3cg
    }
}
