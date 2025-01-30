package com.sample_problem_for_stack_and_queue.implementation_of_queue_from_stack;

//Create Controller Main class to control the execution of the queue
public class QueueControllerMain {
    //Create main method to control the flow of operation of queue.
    public static void main(String[] args) {
        //Create queue object
        QueueUsingStacks queue = new QueueUsingStacks();

        //Create enqueue call
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        //dequeue method call
        System.out.println(queue.dequeue()); // Output: 1
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.peek());    // Output: 3
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4
    }
}
