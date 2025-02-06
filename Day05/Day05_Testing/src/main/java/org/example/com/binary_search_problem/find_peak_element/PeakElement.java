package org.example.com.binary_search_problem.find_peak_element;

public class PeakElement {

    //Method to find the peak element
    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            //Check if mid is the peak element
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return arr[mid];
            }
            //If the left neighbor is greater, move to the left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            //If the right neighbor is greater, move to the right half
            else {
                left = mid + 1;
            }
        }

        //If no peak is found, this will return -1, but in theory, it should never reach here.
        return -1;
    }

}
