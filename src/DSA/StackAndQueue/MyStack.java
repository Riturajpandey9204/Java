package DSA.StackAndQueue;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(45);
        stack.push(655);
        stack.push(89);
        stack.push(33);
        System.out.println(stack.pop());   // Removes and prints the top element
        System.out.println(stack.peek());  // Prints the new top element (does NOT remove it)
        System.out.println(stack.size());  // Prints current number of elements in the stack

    }
}
