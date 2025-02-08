package com.recursive_vs_iterative_computation_05;

public class FibonacciRecursive {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

}
