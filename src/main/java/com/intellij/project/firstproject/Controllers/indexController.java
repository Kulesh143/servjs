package com.intellij.project.firstproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class indexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
