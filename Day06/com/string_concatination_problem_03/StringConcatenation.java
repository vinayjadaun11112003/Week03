package com.string_concatination_problem_03;

//StringConcatenation with concatenate method
class StringConcatenation {
    public void concatenate(int count) {
        String result = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            result += "a"; // Inefficient due to object creation
        }
        long endTime = System.nanoTime();
        System.out.println("String concatenation time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
