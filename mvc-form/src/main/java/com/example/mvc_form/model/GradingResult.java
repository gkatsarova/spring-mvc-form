package com.example.mvc_form.model;

public class GradingResult {

    private String studentName;
    private double examPercentage;
    private double attendancePercentage;
    private double finalScore;
    private int grade;
    private String gradeLabel;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getExamPercentage() {
        return examPercentage;
    }
    public void setExamPercentage(double examPercentage) {
        this.examPercentage = examPercentage;
    }
    public double getAttendancePercentage() {
        return attendancePercentage;
    }
    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }
    public double getFinalScore() {
        return finalScore;
    }
    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getGradeLabel() {
        return gradeLabel;
    }
    public void setGradeLabel(String gradeLabel) {
        this.gradeLabel = gradeLabel;
    }
}
