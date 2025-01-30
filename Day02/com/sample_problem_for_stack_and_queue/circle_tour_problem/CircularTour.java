package com.sample_problem_for_stack_and_queue.circle_tour_problem;

public class CircularTour {
    public static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalFuel = 0, totalDistance = 0;
        int start = 0, fuelBalance = 0;

        for (int i = 0; i < n; i++) {
            totalFuel += petrol[i];
            totalDistance += distance[i];
            fuelBalance += petrol[i] - distance[i];

            // If balance goes negative, reset start to next pump
            if (fuelBalance < 0) {
                start = i + 1;
                fuelBalance = 0;
            }
        }

        // If total fuel is less than total distance, return -1 (tour not possible)
        return (totalFuel >= totalDistance) ? start : -1;
    }

}

