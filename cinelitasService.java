/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.service;

import com.cinelitas.entity.cinelitas;
import com.cinelitas.repository.cinelitasRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Diker Hidalgo
 */
@Service
public class cinelitasService {

    @Autowired
    private cinelitasRepository cinelitasRepository;

    public void guardarCinelitas(cinelitas cinelitas) {
        cinelitasRepository.save(cinelitas);
    }

    public List<cinelitas> verCinelitas() {
        return (List<cinelitas>) cinelitasRepository.findAll();

    }

    public void eliminarCinelitas(cinelitas cinelitas) {
        cinelitasRepository.delete(cinelitas);
    }

}
