package com.school;

public class Main {
    public static void main(String[] args) {
        // Create an array to store Student objects
        Student[] students = new Student[3];

        // Create and initialize Student objects
        students[0] = new Student(101, "Alice");
        students[1] = new Student(102, "Bob");
        students[2] = new Student(103, "Charlie");

        // Create an array to store Course objects
        Course[] courses = new Course[2];

        // Create and initialize Course objects
        courses[0] = new Course("CS101", "Introduction to Computer Science");
        courses[1] = new Course("MA201", "Calculus I");

        // Display details of all students
        System.out.println("Student Details:");
        for (Student student : students) {
            if (student != null) {
                student.displayDetails();
            }
        }

        System.out.println("\nCourse Details:");
        // Display details of all courses
        for (Course course : courses) {
            if (course != null) {
                course.displayDetails();
            }
        }
    }
}
