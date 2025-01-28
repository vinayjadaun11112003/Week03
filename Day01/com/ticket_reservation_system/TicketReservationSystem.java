package com.ticket_reservation_system;


//Create Circular linked list class for ticket reservation system
class TicketReservationSystem {
    private TicketNode last;
    private int ticketCount;

    public TicketReservationSystem() {
        this.last = null;
        this.ticketCount = 0;
    }

    //Create Add a new ticket reservation
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (last == null) {
            newTicket.next = newTicket;
            last = newTicket;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }

        ticketCount++;
        System.out.println("Ticket added successfully: " + ticketId);
    }

    //Craete method Remove a ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = last.next;
        TicketNode previous = last;

        do {
            if (current.ticketId == ticketId) {
                if (current == last && current.next == last) { // Only one ticket in the list
                    last = null;
                } else {
                    previous.next = current.next;
                    if (current == last) {
                        last = previous;
                    }
                }
                ticketCount--;
                System.out.println("Ticket removed successfully: " + ticketId);
                return;
            }
            previous = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Ticket ID not found: " + ticketId);
    }

    //Craete method  Display all tickets in the list
    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = last.next;
        System.out.println("Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    //Craete method  Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = last.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(query) || current.movieName.equalsIgnoreCase(query)) {
                System.out.println("Found Ticket - Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);

        if (!found) {
            System.out.println("No tickets found for query: " + query);
        }
    }

    //Craete method  Calculate the total number of booked tickets
    public void totalTickets() {
        System.out.println("Total Tickets Booked: " + ticketCount);
    }
}
