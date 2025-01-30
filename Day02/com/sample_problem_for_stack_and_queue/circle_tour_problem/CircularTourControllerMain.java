package com.sample_problem_for_stack_and_queue.circle_tour_problem;

public class CircularTourControllerMain {

    // main function to execute the code
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};   // Petrol at each pump
        int[] distance = {6, 5, 3, 5}; // Distance to next pump

        int startPump = CircularTour.findStartingPump(petrol, distance);
        System.out.println("Starting Pump Index: " + startPump);
    }
}
