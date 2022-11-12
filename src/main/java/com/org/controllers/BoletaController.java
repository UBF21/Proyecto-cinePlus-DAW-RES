package com.org.controllers;

import com.org.models.Boleta;
import com.org.repositories.IBoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BoletaController {

    @Autowired
    IBoletaRepository boletaRepository;

    @GetMapping("/boletas")
    List<Boleta> listarBoletas() {
        return boletaRepository.findAll();
    }

    @GetMapping("/boletas/{id}")
    Boleta obtenerBoleta(@PathVariable String id){
        Optional<Boleta> boleta = boletaRepository.findById(id);
        if (boleta.isPresent()){
            boleta.orElse(new Boleta());
        }
        return boleta.get();
    }
}
