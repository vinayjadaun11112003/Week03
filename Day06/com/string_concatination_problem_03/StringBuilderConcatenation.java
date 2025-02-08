package com.string_concatination_problem_03;

//StringBuilderConcatenation with concatenation method
class StringBuilderConcatenation {
    public void concatenate(int count) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder concatenation time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
