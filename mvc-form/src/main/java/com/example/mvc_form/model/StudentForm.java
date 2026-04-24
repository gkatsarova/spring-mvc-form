package com.example.mvc_form.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentForm {

    @NotBlank(message = "Name cannot be empty")
    private String studentName;

    @Min(value = 0, message = "Point must be positive number")
    private double receivedPoints;

    @Min(value = 1, message = "Max point must be at least 1")
    private double maxPoints;

    @Min(value = 0, message = "Attendance cannot be below 0%")
    @Max(value = 100, message = "Attendance cannot be over 100%")
    private double attendancePercentage;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getReceivedPoints() {
        return receivedPoints;
    }
    public void setReceivedPoints(double receivedPoints) {
        this.receivedPoints = receivedPoints;
    }
    public double getMaxPoints() {
        return maxPoints;
    }
    public void setMaxPoints(double maxPoints) {
        this.maxPoints = maxPoints;
    }
    public double getAttendancePercentage() {
        return attendancePercentage;
    }
    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }
}