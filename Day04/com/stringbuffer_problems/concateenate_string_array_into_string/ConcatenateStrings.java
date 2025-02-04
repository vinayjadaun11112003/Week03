package com.stringbuffer_problems.concateenate_string_array_into_string;

public class ConcatenateStrings {
    public static String concatenateStrings(String[] words) {
        //Creating a StringBuffer object
        StringBuffer sb = new StringBuffer();

        //Iterating through each string and append it to StringBuffer
        for (String word : words) {
            sb.append(word);
        }

        //Converting StringBuffer to String and return
        return sb.toString();
    }
}
