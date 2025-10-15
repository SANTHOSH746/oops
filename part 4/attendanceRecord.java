package com.school;

/**
 * Represents a single attendance record for a student in a course.
 * Includes validation for the attendance status.
 */
public class AttendanceRecord {
    private int studentId;
    private String courseId;
    private String status;

    /**
     * Constructs a new AttendanceRecord.
     * Validates the status upon creation.
     *
     * @param studentId The ID of the student.
     * @param courseId The ID of the course.
     * @param status The attendance status ("Present" or "Absent").
     */
    public AttendanceRecord(int studentId, String courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        
        // Validate the status (case-insensitive)
        if (status != null && (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent"))) {
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("Warning: Invalid attendance status '" + status + "'. Marked as 'Invalid'.");
        }
    }

    /**
     * Gets the student ID for this record.
     * @return The student ID.
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Gets the course ID for this record.
     * @return The course ID.
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Gets the status for this record.
     * @return The attendance status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Displays the details of this attendance record to the console.
     */
    public void displayRecord() {
        System.out.println("Student ID: " + studentId + ", Course ID: " + courseId + ", Status: " + status);
    }
}
