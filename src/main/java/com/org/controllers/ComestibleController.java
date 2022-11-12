package com.org.controllers;

import com.org.models.Comestible;
import com.org.repositories.IComestibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ComestibleController {

    @Autowired
    IComestibleRepository comestibleRepository;

    @GetMapping("/comestibles")
    List<Comestible> listarComestibles(){
        return comestibleRepository.findAll();
    }

    @GetMapping("/comestibles/{id}")
    Comestible obtenerComestible(@PathVariable String id){
        Optional<Comestible> comestible = comestibleRepository.findById(id);
        if (comestible.isPresent()){
            comestible.orElse(new Comestible());
        }

        return  comestible.get();
    }

    @PostMapping("/comestibles")
    Comestible guardarComestible(@RequestBody Comestible comestible){
        return comestibleRepository.save(comestible);
    }

    @DeleteMapping("/comestibles/{id}")
    void eliminarComestible(@PathVariable String id){
        comestibleRepository.deleteById(id);
    }
}
