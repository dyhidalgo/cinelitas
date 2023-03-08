/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.controller;

import com.cinelitas.entity.cinelitas;
import com.cinelitas.service.cinelitasService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Diker Hidalgo
 */


@Controller
public class cinelitasController {
    
     @Autowired
    cinelitasService cinelitasService;

    @GetMapping("/peliculaN")
    public String crearPelicula(Model model) {
        List<cinelitas> listaCinelitas = cinelitasService.verCinelitas();
        model.addAttribute("cinelitas", new cinelitas());
        model.addAttribute("cinelitas", listaCinelitas);
        return "crear";
    }

    @GetMapping("/listaCinelitas")
    public String index(Model model) {
        List<cinelitas> listaCinelitas = cinelitasService.verCinelitas();
        model.addAttribute("titulo", "Tabla Peliculas");
        model.addAttribute("cinelitas", listaCinelitas);
        return "listaCinelitas";
    }

    @GetMapping("/delete/{id}")
    public String eliminar(cinelitas cinelitas) {
        cinelitasService.eliminarCinelitas(cinelitas);
        return "redirect:/listaCinelitas";
    }
    
    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute cinelitas cinelitas){
        cinelitasService.guardarCinelitas(cinelitas);
        return "redirect:/";
    }
    
    
}
