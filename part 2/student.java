public class student {
    
}
package com.school;

/**
 * Represents a student with a unique ID and name.
 */
public class Student {
    private int studentId;
    private String studentName;

    /**
     * Constructs a new Student object.
     * @param studentId The unique ID for the student.
     * @param studentName The name of the student.
     */
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    /**
     * Gets the student's ID.
     * @return The student ID.
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Gets the student's name.
     * @return The student's name.
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Displays the student's details to the console.
     */
    public void displayDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + studentName);
    }
}
