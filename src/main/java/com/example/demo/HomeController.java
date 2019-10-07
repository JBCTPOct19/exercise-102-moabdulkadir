package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/")
public String myVals(Model model){
                model.addAttribute("val","greetings");
              model.addAttribute("hey"," shalom");
              return "Hometemplate";
    }
}
