package org.example.com.binary_search_problem.find_peak_element;


public class PeakElementMain {
    //main method to control the execution of the program
    public static void main(String[] args) {
//        int[] arr = {1, 3, 20, 4, 1, 0};
        int[] arr=new int[]{19,25,31,5,8,10,12,16};
        System.out.println("Peak Element: " + PeakElement.findPeak(arr));
    }
}
