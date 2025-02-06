package org.example.com.binary_search_problem.find_rotation_point;

public class RotationPoint {

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        //Binary Search to find the smallest element (rotation point)
        while (left < right) {
            int mid = (left + right) / 2;

            //If middle element is greater than right, smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            //Otherwise, smallest element is in the left half
            else {
                right = mid;
            }
        }

        //The left index will be the rotation point
        return left;
    }
}

