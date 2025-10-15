package com.school;

/**
 * Represents a course with a unique ID and name.
 */
public class Course {
    private String courseId;
    private String courseName;

    /**
     * Constructs a new Course object.
     * @param courseId The unique ID for the course.
     * @param courseName The name of the course.
     */
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    /**
     * Gets the course ID.
     * @return The course ID.
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Gets the course name.
     * @return The course name.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Displays the course's details to the console.
     */
    public void displayDetails() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
    }
}
