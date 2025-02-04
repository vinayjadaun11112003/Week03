package com.stringbuilder_problems.reverse_the_string_from_stringbuilder;

public class ReverseString {
    public static String reverseString(String input) {
        //Creating a StringBuilder object and append the input string
        StringBuilder sb = new StringBuilder(input);


        //Using the reverse() method
        sb.reverse();


        //Converting StringBuilder back to String and return
        return sb.toString();
    }

}
