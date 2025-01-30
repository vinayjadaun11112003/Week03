package com.sample_problem_for_stack_and_queue.stock_span_problem;

//controller main class to control the execution
public class StockSpanControllerMain {
    //Main function to control the flow of execution
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = StockSpan.calculateSpan(prices);

        //Printing results
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
