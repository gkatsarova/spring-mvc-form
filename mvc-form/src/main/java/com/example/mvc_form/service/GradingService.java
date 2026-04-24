package com.example.mvc_form.service;

import com.example.mvc_form.model.GradingResult;
import com.example.mvc_form.model.StudentForm;
import org.springframework.stereotype.Service;

@Service
public class GradingService {

    public GradingResult evaluate(StudentForm form) {
        double examPercentage = (form.getReceivedPoints() / form.getMaxPoints()) * 100.0;
        double finalScore = 0.9 * examPercentage + 0.1 * form.getAttendancePercentage();

        int grade = determineGrade(finalScore);

        GradingResult result = new GradingResult();
        result.setStudentName(form.getStudentName());
        result.setExamPercentage(round(examPercentage));
        result.setAttendancePercentage(form.getAttendancePercentage());
        result.setFinalScore(round(finalScore));
        result.setGrade(grade);
        result.setGradeLabel(gradeLabel(grade));

        return result;
    }

    private int determineGrade(double finalScore) {
        if (finalScore < 50) return 2;
        if (finalScore < 60) return 3;
        if (finalScore < 75) return 4;
        if (finalScore < 90) return 5;
        return 6;
    }

    private String gradeLabel(int grade) {
        return switch (grade) {
            case 2 -> "Poor";
            case 3 -> "Average";
            case 4 -> "Good";
            case 5 -> "Very Good";
            case 6 -> "Excellent";
            default -> "Unknown";
        };
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
