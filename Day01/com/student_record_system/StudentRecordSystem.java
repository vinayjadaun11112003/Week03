package com.student_record_system;

public class StudentRecordSystem{
    public static void main(String[] args) {
        StudentRecords records = new StudentRecords();

        // Adding some student records
        records.addAtBeginning(1, "vinay jadaun", 20, 'A');
        records.addAtEnd(2, "udit patel", 21, 'B');
        records.addAtPosition(2, 3, "vivek yadav", 22, 'C');

        // Display all records
        System.out.println("All Student Records:");
        records.displayAll();

        // Search for a student
        System.out.println("\nSearching for Roll Number 2:");
        records.searchByRollNumber(2);

        // Update a student's grade
        System.out.println("\nUpdating grade for Roll Number 1:");
        records.updateGrade(1, 'A');

        // Delete a student
        System.out.println("\nDeleting Roll Number 3:");
        records.deleteByRollNumber(3);

        // Display all records again
        System.out.println("\nAll Student Records after deletion:");
        records.displayAll();
    }
}