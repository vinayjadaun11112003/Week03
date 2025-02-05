package com.binary_search_problem.search_for_target_in_2d_array;

public class MatrixSearch {

    //Method to search the target value in the 2D matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;  // Return false if the matrix is empty
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        //Treating the matrix as a 1D array
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = (right+left) / 2;

            //Converting mid to row and column indices
            int row = mid / cols;
            int col = mid % cols;

            //Comparing the middle element with the target
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid+1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        //If the target is not found
        return false;
    }


}



