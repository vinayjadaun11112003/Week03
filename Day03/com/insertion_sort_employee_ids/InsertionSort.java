package com.insertion_sort_employee_ids;

import java.util.Arrays;
//implementation of insertion sort algorithm
public class InsertionSort {
    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i];
            int j = i - 1;

            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }
            employeeIDs[j + 1] = key;
        }
    }
//main method to control the flow of execution
    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 110, 101, 108, 107};

        System.out.println("Original Employee IDs: " + Arrays.toString(employeeIDs));

        insertionSort(employeeIDs);

        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
    }
}
