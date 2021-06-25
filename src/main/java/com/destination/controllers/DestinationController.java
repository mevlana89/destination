package com.destination.controllers;

import com.destination.services.DestinationService;
import com.destination.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping("/destination/{idDestionation}")
    public String destinationDetail(Model model, @PathVariable Long idDestionation)
    {
        model.addAttribute("destinationDetail", destinationService.findAllEtapes(idDestionation) );
        return "destination";
    }
}
