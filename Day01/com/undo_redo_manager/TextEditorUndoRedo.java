package com.undo_redo_manager;


//Create controller Main class to test the UndoRedoManager
public class TextEditorUndoRedo {
    //Create main method to control the flow of execution
    public static void main(String[] args) {
        UndoRedoManager manager = new UndoRedoManager(10);

        manager.addState("State 1: Hello");
        manager.addState("State 2: Hello World");0
        manager.addState("State 3: Hello World!");

        manager.displayCurrentState(); // Should display "State 3: Hello World!"

        manager.undo(); // Undo to "State 2: Hello World"
        manager.displayCurrentState();

        manager.undo(); // Undo to "State 1: Hello"
        manager.displayCurrentState();

        manager.redo(); // Redo to "State 2: Hello World"
        manager.displayCurrentState();

        manager.redo(); // Redo to "State 3: Hello World!"
        manager.displayCurrentState();

        manager.undo(); // Undo to "State 2: Hello World"
        manager.addState("State 4: New Content"); // Adds a new state, discards redo history
        manager.displayCurrentState();
    }
}
