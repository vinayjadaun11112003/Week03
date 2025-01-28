package com.movie_management_system;

//Create Doubly linked list class for movie management
class MovieManagementSystem {
    //Create attibutes of this class head and tail
    private MovieNode head;
    private MovieNode tail;

    //Create constructor to set the head and tail null
    public MovieManagementSystem() {
        this.head = null;
        this.tail = null;
    }

    //Create method to Add a movie at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //Create method to Add a movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //Create method to Add a movie at a specific position
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    //Create method to Remove a movie by title
    public void removeByTitle(String title) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with title \"" + title + "\" not found.");
    }

    //Create method to Search for a movie by director or rating
    public void searchByDirectorOrRating(String director, double rating) {
        MovieNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.director.equals(director) || current.rating == rating) {
                System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No movies found matching the criteria.");
        }
    }

    //Create method to Display all movies in forward order
    public void displayForward() {
        MovieNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    //Create method to Display all movies in reverse order
    public void displayReverse() {
        MovieNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    //Create method to Update a movie's rating by title
    public void updateRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                System.out.println("Updated rating for movie \"" + title + "\" to " + newRating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie with title \"" + title + "\" not found.");
    }
}
