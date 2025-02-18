package com.formsklon.demo.controller;

import org.springframework.stereotype.Controller; // @Controller annotation'ı ekledik.
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Sınıfı Controller olarak işaret ettik
public class MultiSegmentController {

    @GetMapping("/multi")
    public String home(Model model) {
        String[] items = { "Item 1", "Item 2", "Item 3", "Item 4" };
        model.addAttribute("items", items); // Model'e veri ekledik
        return "multi"; // multi.html sayfasını döndürüyoruz
    }
}
