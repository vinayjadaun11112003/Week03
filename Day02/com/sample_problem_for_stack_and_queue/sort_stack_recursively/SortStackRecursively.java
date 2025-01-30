package com.sample_problem_for_stack_and_queue.sort_stack_recursively;

import java.util.Stack;

class SortStackRecursively {

    //Creating Function to sort a stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            //Popping the top element
            int temp = stack.pop();
            //Recursively sorting the remaining stack
            sortStack(stack);

            //Inserting the popped element back in sorted order
            insertSorted(stack, temp);
        }
    }

    //Creating function to insert an element in sorted order
    public static void insertSorted(Stack<Integer> stack, int element) {
        //If stack is empty or element is greater than top, push it
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            //Pop the top and recursively insert the element
            int temp = stack.pop();
            insertSorted(stack, element);
            // Push back the popped element
            stack.push(temp);
        }
    }


}
