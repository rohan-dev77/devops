package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Attendance;
import java.util.ArrayList;
import java.util.List;
@Controller
public class AttendanceController {
    private List<Attendance> list = new ArrayList<>();
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("attendance", new Attendance());
        return "form";
    }
    @PostMapping("/submit")
    public String submit(@ModelAttribute Attendance attendance) {
        list.add(attendance);
        return "success";
    }
}