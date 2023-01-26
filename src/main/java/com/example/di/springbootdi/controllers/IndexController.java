package com.example.di.springbootdi.controllers;

import com.example.di.springbootdi.models.services.IServicio;
import com.example.di.springbootdi.models.services.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("miServicioComplejo")
    private IServicio servicio;

    @GetMapping({"/index","/",""})
    public String index(Model model){
        model.addAttribute("objeto",servicio.operacion());
        return "index";
    }

}
