package com.stringbuffer_problems.stringbuilder_vs_stringbuffer;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        //1 million concatenations
        int iterations = 1_000_000;
        String text = "hello";

        //Measuring execution time for StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long bufferTime = endTimeBuffer - startTimeBuffer;

        //Measuring execution time for StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long builderTime = endTimeBuilder - startTimeBuilder;

        //Displaying results
        System.out.println("Execution Time (StringBuffer): " + bufferTime / 1_000_000 + " ms");
        System.out.println("Execution Time (StringBuilder): " + builderTime / 1_000_000 + " ms");

        //Determining which one is faster
        if (bufferTime > builderTime) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}

