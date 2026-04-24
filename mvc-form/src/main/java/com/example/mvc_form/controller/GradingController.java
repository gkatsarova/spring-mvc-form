package com.example.mvc_form.controller;

import com.example.mvc_form.model.GradingResult;
import com.example.mvc_form.model.StudentForm;
import com.example.mvc_form.service.GradingService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GradingController {

    private final GradingService gradingService;

    public GradingController(GradingService gradingService) {
        this.gradingService = gradingService;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("studentForm", new StudentForm());
        return "form";
    }

    @PostMapping("/grade")
    public String processGrade(@Valid @ModelAttribute("studentForm") StudentForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "form";
        }

        GradingResult result = gradingService.evaluate(form);
        model.addAttribute("result", result);
        return "result";
    }
}