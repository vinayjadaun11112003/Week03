package com.stringbuilder_problems.remove_duplicates_from_string;

import java.util.Scanner;

public class RemoveDuplicatesMain {

    public static void main(String[] args) {
        //Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        //Removing duplicates and display the result
        String result = RemoveDuplicates.removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        //closing the scanner object
        scanner.close();
    }
}
