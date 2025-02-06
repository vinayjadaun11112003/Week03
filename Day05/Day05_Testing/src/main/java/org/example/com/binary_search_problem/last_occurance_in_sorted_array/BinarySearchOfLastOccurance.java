package org.example.com.binary_search_problem.last_occurance_in_sorted_array;

public class BinarySearchOfLastOccurance {

        public static int findFirstOccurrence(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            int first = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    first = mid;
                    right = mid - 1;  // Search in the left half for first occurrence
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return first;
        }

        public static int findLastOccurrence(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            int last = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    last = mid;
                    left = mid + 1;  // Search in the right half for last occurrence
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return last;
        }

        public static int[] findFirstAndLast(int[] arr, int target) {
            int first = findFirstOccurrence(arr, target);
            if (first == -1) {
                return new int[] {-1};  // Element not found
            }

            int last = findLastOccurrence(arr, target);
            return new int[] {first, last};
        }


    }


