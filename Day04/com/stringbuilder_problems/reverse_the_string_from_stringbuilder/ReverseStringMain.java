package com.stringbuilder_problems.reverse_the_string_from_stringbuilder;

import java.util.Scanner;

public class ReverseStringMain {
    public static void main(String[] args) {
        //Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();


        //Reversing the string and display the result
        String reversed = ReverseString.reverseString(input);
        System.out.println("Reversed string: " + reversed);

        //closing the scanner object
        scanner.close();
    }
}
