package com.formsklon.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MultiSegmentController {

    @GetMapping("/multi")
    public String home(Model model) {
        String[] items = { "Soru 1", "Soru 2", "Soru 3", "Soru 4", "Soru 5" };
        model.addAttribute("items", items); // Modele veri ekledik
        return "multi";
    }
}
