package com.social_media_application;
import java.util.*;
//Create Singly linked list class for managing friend connections
class SocialMediaFriends {
    private UserNode head;

    public SocialMediaFriends() {
        this.head = null;
    }

    //Create Add a new user to the system
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newUser;
        }
    }

    //Create Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(userId2)) {
                user1.friendIds.add(userId2);
            }
            if (!user2.friendIds.contains(userId1)) {
                user2.friendIds.add(userId1);
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    //Create Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        } else {
            System.out.println("One or both users not found.");
        }
    }

    //Create Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            Set<Integer> mutualFriends = new HashSet<>(user1.friendIds);
            mutualFriends.retainAll(user2.friendIds);

            System.out.println("Mutual friends between User " + userId1 + " and User " + userId2 + ": " + mutualFriends);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    //Create Display all friends of a specific user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user != null) {
            System.out.println("Friends of User " + userId + ": " + user.friendIds);
        } else {
            System.out.println("User not found.");
        }
    }

    //Create Search for a user by Name or User ID
    public void searchUser(String nameOrId) {
        try {
            int userId = Integer.parseInt(nameOrId);
            UserNode user = findUserById(userId);
            if (user != null) {
                System.out.println("User found: " + user.name + ", Age: " + user.age);
            } else {
                System.out.println("User not found.");
            }
        } catch (NumberFormatException e) {
            UserNode current = head;
            while (current != null) {
                if (current.name.equalsIgnoreCase(nameOrId)) {
                    System.out.println("User found: ID: " + current.userId + ", Age: " + current.age);
                    return;
                }
                current = current.next;
            }
            System.out.println("User not found.");
        }
    }

    //Create Count the number of friends for each user
    public void countFriends() {
        UserNode current = head;
        while (current != null) {
            System.out.println("User " + current.userId + " has " + current.friendIds.size() + " friends.");
            current = current.next;
        }
    }

    //Create Helper method to find a user by ID
    private UserNode findUserById(int userId) {
        UserNode current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}