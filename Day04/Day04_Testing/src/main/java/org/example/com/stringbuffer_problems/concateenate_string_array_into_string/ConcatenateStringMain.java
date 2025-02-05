package org.example.com.stringbuffer_problems.concateenate_string_array_into_string;

import java.util.Scanner;

public class ConcatenateStringMain {

    public static void main(String[] args) {
        //Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] words = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        //Concatenating strings and display result
        String result = ConcatenateStrings.concatenateStrings(words);
        System.out.println("Concatenated String: " + result);

        //Closing the object of scanner class
        scanner.close();
    }
}
