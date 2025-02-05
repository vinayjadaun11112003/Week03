package com.binary_search_problem.find_rotation_point;

public class RotationPointMain {

    public static void main(String[] args) {
        int[] rotatedArray = {15, 18, 2, 3, 6, 12};  // Example rotated sorted array
        int rotationIndex = RotationPoint.findRotationPoint(rotatedArray);
        System.out.println("The rotation point is at index: " + rotationIndex);
        System.out.println("The smallest element is: " + rotatedArray[rotationIndex]);
    }
}
