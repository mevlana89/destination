package com.destination.controllers;

import com.destination.entities.Destination;
import com.destination.repositories.DestinationRepository;
import com.destination.services.AdminService;
import com.destination.services.DestinationService;
import com.destination.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/admin")
    public String index(Model model)
    {
        model.addAttribute("destinations",adminService.findAllDestinations() );
        return "admin";
    }

    @PostMapping("/admin/destination")
    public String saveExpensesList(@ModelAttribute Destination destination) {
        adminService.save(destination);
        return "redirect:/admin";
    }
}
