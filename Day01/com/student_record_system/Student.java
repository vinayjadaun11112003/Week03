package com.student_record_system;

//Create class Student which is further are going to create a part of linked list
public class Student {
    //Create attributes of rollnumber, name, age, grade and next pointer of student class
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    //Create constructor of the student class
    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
