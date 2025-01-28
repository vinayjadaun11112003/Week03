package com.social_media_application;

// Main class to test the SocialMediaFriends system
public class SocialMediaMain {
    public static void main(String[] args) {
        SocialMediaFriends smf = new SocialMediaFriends();

        smf.addUser(1, "Vivek yadav", 25);
        smf.addUser(2, "Vinay Jadaun", 30);
        smf.addUser(3, "udit patel", 20);

        smf.addFriendConnection(1, 2);
        smf.addFriendConnection(1, 3);

        System.out.println("Displaying all friends:");
        smf.displayFriends(1);
        smf.displayFriends(2);

        System.out.println("\nMutual friends between 1 and 2:");
        smf.findMutualFriends(1, 2);

        System.out.println("\nRemoving friend connection between 1 and 2:");
        smf.removeFriendConnection(1, 2);

        System.out.println("Displaying all friends after removal:");
        smf.displayFriends(1);
        smf.displayFriends(2);

        System.out.println("\nCounting friends for each user:");
        smf.countFriends();

        System.out.println("\nSearching for user by ID or Name:");
        smf.searchUser("Alice");
        smf.searchUser("3");
    }
}
