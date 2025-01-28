package com.round_robin_algorithm;

//Create Circular linked list class for round-robin scheduling
class RoundRobinScheduler {
    //Create attributes of the class head and tail.
    private ProcessNode head;
    private ProcessNode tail;

    //Create constructor to set the head and tail to null
    public RoundRobinScheduler() {
        this.head = null;
        this.tail = null;
    }

    //Create method to Add a new process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // Make it circular
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    //Create method to Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        ProcessNode current = head;
        ProcessNode prev = tail;
        do {
            if (current.processId == processId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev;
                    }
                }
                System.out.println("Process " + processId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process " + processId + " not found.");
    }

    //Create method to Simulate the round-robin scheduling algorithm
    public void simulateScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        ProcessNode current = head;
        int totalProcesses = countProcesses();
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int elapsedTime = 0;

        while (totalProcesses > 0) {
            if (current.burstTime > 0) {
                System.out.println("Executing Process ID: " + current.processId);

                if (current.burstTime > timeQuantum) {
                    elapsedTime += timeQuantum;
                    current.burstTime -= timeQuantum;
                } else {
                    elapsedTime += current.burstTime;
                    totalTurnaroundTime += elapsedTime;
                    totalWaitingTime += elapsedTime - current.burstTime;
                    current.burstTime = 0;
                    removeProcess(current.processId);
                    totalProcesses--;
                }
            }
            current = current.next;
        }

        double avgWaitingTime = (double) totalWaitingTime / countProcesses();
        double avgTurnaroundTime = (double) totalTurnaroundTime / countProcesses();

        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    //Create method to Display the processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode current = head;
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }

    //Create method to Count the total number of processes
    private int countProcesses() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        ProcessNode current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }
}
