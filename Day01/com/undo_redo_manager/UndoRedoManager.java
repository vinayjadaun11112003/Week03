package com.undo_redo_manager;

//Craete Doubly linked list class for undo/redo functionality
class UndoRedoManager {
    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int maxSize;

    public UndoRedoManager(int maxSize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    //Craete method  Add a new text state
    public void addState(String content) {
        TextStateNode newState = new TextStateNode(content);

        // If the list is empty
        if (head == null) {
            head = tail = current = newState;
        } else {
            // Remove all states after the current state
            if (current.next != null) {
                current.next.prev = null;
                current.next = null;
            }

            // Add the new state
            current.next = newState;
            newState.prev = current;
            current = newState;
            tail = newState;
        }

        size++;

        // Ensure the history size does not exceed maxSize
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    //Craete method  Undo functionality
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.content);
        } else {
            System.out.println("No more undo steps available.");
        }
    }

    //Craete method  Redo functionality
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.content);
        } else {
            System.out.println("No more redo steps available.");
        }
    }

    //Craete method  Display the current state of the text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No state available.");
        }
    }
}
