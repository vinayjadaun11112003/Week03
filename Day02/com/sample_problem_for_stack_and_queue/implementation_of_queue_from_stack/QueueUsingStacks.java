package com.sample_problem_for_stack_and_queue.implementation_of_queue_from_stack;
import java.util.Stack;
//Create Queueusingstack class to implement the queue from stack of two.
//one stack to maintain insertion and one to maintain deletion.
class QueueUsingStacks {
    //Create two stack which the attributes of the class.
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    //Constructor to initialize the two stacks.
    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //Enqueue operation (O(1)) time complexity
    public void enqueue(int item) {
        stack1.push(item);
    }

    //Dequeue operation worst-case O(n))
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    //Peek operation O(1)
    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    //Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
