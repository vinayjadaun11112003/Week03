package org.example.com.challenge_problem;

public class MainController {
//main method to control the flow of code
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("First missing positive integer: " + SearchAndMissingNumber.firstMissingPositive(nums));

        int[] sortedArr = {-1, 0, 3, 5, 7, 9};
        int target = 5;
        int index = SearchAndMissingNumber.binarySearch(sortedArr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}
