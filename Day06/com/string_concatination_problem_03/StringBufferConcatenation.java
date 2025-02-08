package com.string_concatination_problem_03;

//StringBufferConcatenation with concatenate method
class StringBufferConcatenation {
    public void concatenate(int count) {
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer concatenation time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
