package com.example.QuizFinal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    
    @RequestMapping({"/", "/home"})
    public String home(Model model){
        model.addAttribute("message", "Finals");
        return "home";
    }
    
    @RequestMapping("/tardy")
    public String appearance(Model model){
        model.addAttribute("message", "keep up with our");
        return "appearance";
    }
    
    @RequestMapping("/finalGrade")
    public String grades(Model model){
        model.addAttribute("message", "grading was a");
        return "grades";
    }
}
