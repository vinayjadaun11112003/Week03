package com.bubble_sort_student_marks;

import java.util.Arrays;
//Creating bubble sort algorithm from scratch
public class BubbleSort {
    //method to perform bubblesort in the array
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    //Swap the elements
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            //If no swaps occurred in this pass, the array is already sorted
            if (!swapped) break;
        }
    }

    //main method to control the execution of program
    public static void main(String[] args) {
        int[] studentMarks = {85, 72, 90, 60, 45, 95, 80};

        System.out.println("Original Marks: " + Arrays.toString(studentMarks));

        bubbleSort(studentMarks);

        System.out.println("Sorted Marks: " + Arrays.toString(studentMarks));
    }
}

