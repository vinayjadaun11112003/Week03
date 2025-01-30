package com.sample_problem_for_stack_and_queue.sliding_window_problem;

import java.util.Arrays;

public class SlidingWindowMaximumControllerMain {

    // main function to control the flow of program
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = SlidingWindowMaximum.maxSlidingWindow(nums, k);

        // Print results
        System.out.println(Arrays.toString(result));
    }
}
