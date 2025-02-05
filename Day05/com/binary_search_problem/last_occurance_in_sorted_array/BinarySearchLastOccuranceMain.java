package com.binary_search_problem.last_occurance_in_sorted_array;

public class BinarySearchLastOccuranceMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 5, 6};
        int target = 2;
        int[] result = BinarySearchOfLastOccurance.findFirstAndLast(arr, target);

        if (result[0] != -1) {
            System.out.println("First occurrence: " + result[0] + ", Last occurrence: " + result[1]);
        } else {
            System.out.println("Element not found");
        }
    }
}
