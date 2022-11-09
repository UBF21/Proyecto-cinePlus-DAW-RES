package com.org.controllers;

import com.org.models.Pelicula;
import com.org.repositories.IPeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeliculaController {

    @Autowired
    IPeliculaRepository repositoryPelicula;

    @GetMapping("/peliculas")
    public List<Pelicula> Listadopeliculas() {

        return repositoryPelicula.findAll();
    }
}
