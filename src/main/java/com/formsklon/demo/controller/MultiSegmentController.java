package com.formsklon.demo.controller;

import org.springframework.stereotype.Controller; // @Controller annotation'ı ekledik.
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Sınıfı Controller olarak işaret ettik
public class MultiSegmentController {

    @GetMapping("/multi")
    public String home(Model model) {
        String[] items = { "Soru 1", "Soru 2", "Soru 3", "Soru 4" };
        model.addAttribute("items", items); // Model'e veri ekledik
        return "multi"; // multi.html sayfasını döndürüyoruz
    }
}
