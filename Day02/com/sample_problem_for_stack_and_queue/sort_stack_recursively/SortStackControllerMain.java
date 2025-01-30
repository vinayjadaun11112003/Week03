package com.sample_problem_for_stack_and_queue.sort_stack_recursively;

import java.util.Stack;

public class SortStackControllerMain {
    //main method to control the flow of code
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        SortStackRecursively.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
