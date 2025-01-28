package com.task_scheduler_system;


//Create Circular linked list class for task scheduler
class TaskScheduler {
    private TaskNode head;
    private TaskNode tail;
    private TaskNode current;

    public TaskScheduler() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    //Create Add a task at the beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    //Create Add a task at the end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (tail == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    //Create Add a task at a specific position
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 0 || head == null) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode current = head;
        int index = 0;

        while (index < position - 1 && current.next != head) {
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == tail) {
            tail = newNode;
        }
    }

    //Create Remove a task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode current = head;
        TaskNode previous = null;

        do {
            if (current.taskId == taskId) {
                if (previous == null) { // Removing head
                    if (head == tail) { // Only one task in the list
                        head = tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    //Create View the current task and move to the next task
    public void viewAndMoveToNextTask() {
        if (current == null) {
            current = head;
        }

        if (current != null) {
            System.out.println("Current Task: ID: " + current.taskId + ", Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    //Create Display all tasks in the list
    public void displayTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode current = head;
        do {
            System.out.println("ID: " + current.taskId + ", Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    //Create Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode current = head;
        boolean found = false;

        do {
            if (current.priority == priority) {
                System.out.println("ID: " + current.taskId + ", Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tasks with priority " + priority + " found.");
        }
    }
}
