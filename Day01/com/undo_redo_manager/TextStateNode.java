package com.undo_redo_manager;

// Node class representing a state of the text content
class TextStateNode {
    String content;
    TextStateNode prev;
    TextStateNode next;

    public TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
