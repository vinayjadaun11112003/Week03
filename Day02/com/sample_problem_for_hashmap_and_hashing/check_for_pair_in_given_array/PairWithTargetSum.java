package com.sample_problem_for_hashmap_and_hashing.check_for_pair_in_given_array;

import java.util.*;

public class PairWithTargetSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(target - num)) {
                System.out.println("Pair found: (" + num + ", " + (target - num) + ")");
                return true;
            }
            seen.add(num);
        }

        System.out.println("No pair found.");
        return false;
    }

    //main method to control the flow of code
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        hasPairWithSum(arr, target);
    }
}

