package org.example.com.stringbuilder_problems.remove_duplicates_from_string;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        //Initializing a StringBuilder to store the result
        StringBuilder sb = new StringBuilder();

        //Using a HashSet to track seen characters
        HashSet<Character> seen = new HashSet<>();

        //Iterating through the input string
        for (char c : input.toCharArray()) {
            // If character is not already in the set, add it
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        //Converting StringBuilder to String and return
        return sb.toString();
    }

}
