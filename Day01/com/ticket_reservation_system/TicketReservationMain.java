package com.ticket_reservation_system;

//Create controller Main class to test the TicketReservationSystem
public class TicketReservationMain {
    //create main method to control the flow of exection
    public static void main(String[] args) {
        //Create object for the ticketreservation
        TicketReservationSystem system = new TicketReservationSystem();

        //call the method to add ticket
        system.addTicket(101, "Vinay Jadaun", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Vivek Yadav", "Interstellar", "B2", "01:00 PM");
        system.addTicket(103, "abhishek sahani", "Tenet", "C3", "04:00 PM");

        //call method to display the tickets
        system.displayTickets();

        //call method to serach the ticket
        System.out.println("\nSearching for tickets:");
        system.searchTicket("Blade runner 2049");
        system.searchTicket("Inception");

        //call method to display the ticket after removal
        System.out.println("\nRemoving a ticket:");
        system.removeTicket(102);
        system.displayTickets();

        //total tickets
        System.out.println("\nTotal tickets:");
        system.totalTickets();
    }
}
