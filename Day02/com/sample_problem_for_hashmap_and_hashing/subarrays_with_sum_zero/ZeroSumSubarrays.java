package com.sample_problem_for_hashmap_and_hashing.subarrays_with_sum_zero;

import java.util.*;
//creating zerosumsubarrayproblem
public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray found from index " + (start + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    //main method to control the flow of program
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6, -3, 2, -2};
        findZeroSumSubarrays(arr);
    }
}

