package com.destination.controllers;

import com.destination.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("destinations",homeService.findAllDestinations() );
        return "index";
    }
}
