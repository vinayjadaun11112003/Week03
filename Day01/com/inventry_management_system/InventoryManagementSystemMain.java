package com.inventry_management_system;

//Create class of controller(inventryManagementSystemMain) class for execution
public class InventoryManagementSystemMain {
    public static void main(String[] args) {
        //Create object of intentry to perform task onto that
        InventoryManagementSystem ims = new InventoryManagementSystem();

        //call method to add at begining, end and at specific position
        ims.addAtEnd("Laptop", 101, 10, 800.0);
        ims.addAtBeginning("Mouse", 102, 50, 20.0);
        ims.addAtPosition(1, "Keyboard", 103, 30, 50.0);

        //Call method to display inventry data
        System.out.println("All Items:");
        ims.displayInventory();

        //Call method to calculate total value of the inventry
        System.out.println("\nTotal Inventory Value:");
        ims.calculateTotalValue();

        //Call search by id method to search
        System.out.println("\nSearching for item with ID 101:");
        ims.searchByIdOrName(101, "");

        //Call update quantity and again display the inventry data
        System.out.println("\nUpdating quantity for Item ID 102:");
        ims.updateQuantity(102, 60);
        ims.displayInventory();

        //Call sortbyname method to sort the linkedlist and again display the inventry
        System.out.println("\nSorting inventory by Item Name:");
        ims.sortByName();
        ims.displayInventory();

        //Call sort by price in decending direction
        System.out.println("\nSorting inventory by Price (descending):");
        ims.sortByPrice(false);
        ims.displayInventory();
    }
}
