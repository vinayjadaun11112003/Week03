package com.round_robin_algorithm;


//Create controller class for testing the Round Robin Scheduler
public class RoundRobinSchedulerMain {
    //Create main class which will control the flow of program
    public static void main(String[] args) {
        //Create object from which the further task of rbs will be performed
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        //Call method to add process
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 3);

        //Call method to display process
        System.out.println("Processes in the queue:");
        scheduler.displayProcesses();

        //call the method to simulate the process
        System.out.println("\nSimulating Round Robin Scheduling with Time Quantum = 3:");
        scheduler.simulateScheduling(3);

        //call the display method
        System.out.println("\nProcesses in the queue after simulation:");
        scheduler.displayProcesses();
    }
}
