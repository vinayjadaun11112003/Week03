package com.sample_problem_for_hashmap_and_hashing.two_sum_problem;

import java.util.*;

public class TwoSum {

    // Linked list node to handle collisions using separate chaining
    static class ListNode {
        int index;
        ListNode next;

        ListNode(int index) {
            this.index = index;
            this.next = null;
        }
    }

    // Hash map with an array of linked lists to handle collisions
    public static int[] twoSum(int[] nums, int target) {
        // Create the hash map with size equal to the array length
        ListNode[] map = new ListNode[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the hash map
            int hash = Math.abs(complement) % nums.length;
            ListNode head = map[hash];
            while (head != null) {
                if (nums[head.index] == complement) {
                    return new int[]{head.index, i};
                }
                head = head.next;
            }

            // If complement doesn't exist, insert the current element into the hash map
            int index = Math.abs(nums[i]) % nums.length;
            ListNode newNode = new ListNode(i);
            newNode.next = map[index];
            map[index] = newNode;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

