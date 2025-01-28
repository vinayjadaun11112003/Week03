package com.task_scheduler_system;

//Create controller Main class for testing
public class TaskSchedulerMain {
    //Cretae main method to control the flow of program
    public static void main(String[] args) {
        //Create object for the tash schedular
        TaskScheduler scheduler = new TaskScheduler();

        //call method to add at end, start and specific position
        scheduler.addAtEnd(1, "Task A", 1, "2025-02-01");
        scheduler.addAtBeginning(2, "Task B", 2, "2025-02-05");
        scheduler.addAtPosition(1, 3, "Task C", 3, "2025-02-10");

        //call method to display all task
        System.out.println("All Tasks:");
        scheduler.displayTasks();

        //call method to view the task
        System.out.println("\nViewing current task and moving to next:");
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        //call method to serach
        System.out.println("\nSearching for tasks with priority 2:");
        scheduler.searchByPriority(2);

        //call method to remove task
        System.out.println("\nRemoving task with ID 2:");
        scheduler.removeByTaskId(2);

        //call method to display the task
        System.out.println("\nAll Tasks after removal:");
        scheduler.displayTasks();
    }
}
