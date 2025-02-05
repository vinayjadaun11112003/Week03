package com.binary_search_problem.search_for_target_in_2d_array;

public class MatrixSearchMain {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 4, 7, 11},
                {12, 15, 18, 20},
                {23, 26, 29, 31},
                {32, 356, 2564, 45817}
        };

        int target1 = 29;
        System.out.println("Target found in matrix1: " + MatrixSearch.searchMatrix(matrix1, target1));  // Should return true

        int target2 = 540;
        System.out.println("Target found in matrix1: " + MatrixSearch.searchMatrix(matrix1, target2));  // Should return false

        int[][] matrix2 = {
                {1, 3, 5},
                {10, 11, 16},
                {23, 30, 34}
        };

        int target3 = 16;
        System.out.println("Target found in matrix2: " + MatrixSearch.searchMatrix(matrix2, target3));  // Should return true

        int target4 = 40;
        System.out.println("Target found in matrix2: " + MatrixSearch.searchMatrix(matrix2, target4));  // Should return false
    }
}
