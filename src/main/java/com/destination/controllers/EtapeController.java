package com.destination.controllers;

import com.destination.services.EtapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EtapeController
{
    @Autowired
    private EtapeService etapeService;

    @GetMapping("/destination/etape/{idEtape}")
    public String etapeDetail(Model model, @PathVariable Long idEtape)
    {
        model.addAttribute("liens", etapeService.findAllLiens(idEtape) );
        return "etape";
    }
}
