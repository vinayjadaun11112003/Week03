package com.inventry_management_system;


//Craate the Singly linked list class for inventory management
class InventoryManagementSystem {
    //Create head node attribute
    private InventoryNode head;

    //Create constructor to sst the head to null
    public InventoryManagementSystem() {
        this.head = null;
    }

    //Create method Add an item at the beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    //Create method to Add an item at the end
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
        } else {
            InventoryNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add an item at a specific position
    public void addAtPosition(int position, String itemName, int itemId, int quantity, double price) {
        if (position <= 0 || head == null) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }

        InventoryNode newNode = new InventoryNode(itemName, itemId, quantity, price);
        InventoryNode current = head;
        int index = 0;

        while (index < position - 1 && current.next != null) {
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    //Create method to Remove an item based on Item ID
    public void removeByItemId(int itemId) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            return;
        }

        InventoryNode current = head;
        while (current.next != null && current.next.itemId != itemId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Item with ID " + itemId + " not found.");
        } else {
            current.next = current.next.next;
        }
    }

    //Create method to Update the quantity of an item by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        InventoryNode current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                System.out.println("Updated quantity for Item ID " + itemId + " to " + newQuantity);
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }

    //Create method to Search for an item by Item ID or Item Name
    public void searchByIdOrName(int itemId, String itemName) {
        InventoryNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.itemId == itemId || current.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Item Found: Name: " + current.itemName + ", ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No items matching the criteria found.");
        }
    }

    //Create method to Calculate and display total inventory value
    public void calculateTotalValue() {
        double totalValue = 0;
        InventoryNode current = head;
        while (current != null) {
            totalValue += current.quantity * current.price;
            current = current.next;
        }
        System.out.println("Total Inventory Value: $" + totalValue);
    }

    //Create method to Sort inventory by Item Name (ascending)
    public void sortByName() {
        if (head == null || head.next == null) return;

        head = mergeSort(head, true);
        System.out.println("Inventory sorted by Item Name.");
    }

    //Create the method to Sort inventory by Price (ascending or descending)
    public void sortByPrice(boolean ascending) {
        if (head == null || head.next == null) return;

        head = mergeSort(head, ascending);
        System.out.println("Inventory sorted by Price " + (ascending ? "ascending" : "descending") + ".");
    }

    //Create the method to Helper function for merge sort
    private InventoryNode mergeSort(InventoryNode node, boolean sortByName) {
        if (node == null || node.next == null) return node;

        InventoryNode middle = getMiddle(node);
        InventoryNode nextOfMiddle = middle.next;

        middle.next = null;

        InventoryNode left = mergeSort(node, sortByName);
        InventoryNode right = mergeSort(nextOfMiddle, sortByName);

        return sortedMerge(left, right, sortByName);
    }

    //Create a method to merge the sorted part of the linkedlist
    private InventoryNode sortedMerge(InventoryNode left, InventoryNode right, boolean sortByName) {
        if (left == null) return right;
        if (right == null) return left;

        if (sortByName) {
            if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
                left.next = sortedMerge(left.next, right, true);
                return left;
            } else {
                right.next = sortedMerge(left, right.next, true);
                return right;
            }
        } else {
            if (left.price <= right.price) {
                left.next = sortedMerge(left.next, right, false);
                return left;
            } else {
                right.next = sortedMerge(left, right.next, false);
                return right;
            }
        }
    }

    //Create a method to find the middle of the linkedlist
    private InventoryNode getMiddle(InventoryNode node) {
        if (node == null) return node;

        InventoryNode slow = node, fast = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //Create the method to Display all items in the inventory
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        InventoryNode current = head;
        while (current != null) {
            System.out.println("Name: " + current.itemName + ", ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}
