
package com.formsklon.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

@Controller
public class FormController {

    @GetMapping("/form")
    public String home() {
        return "form"; // form.html Thymeleaf içindeki dosya
    }
}
