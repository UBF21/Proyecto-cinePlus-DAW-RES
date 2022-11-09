package com.org.controllers;

import com.org.models.Pelicula;
import com.org.repositories.IPeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PeliculaController {

    @Autowired
    IPeliculaRepository repositoryPelicula;

    @GetMapping("/peliculas")
    List<Pelicula> Listadopeliculas() {

        return repositoryPelicula.findAll();
    }

    @GetMapping("/peliculas/{id}")
    Pelicula obtenerPelicula(@PathVariable String id) {
        Optional<Pelicula> pelicula = repositoryPelicula.findById(id);
        if (pelicula.isPresent()) {
            return pelicula.orElse(new Pelicula());
        }

        return pelicula.get();
    }

    @PostMapping("/peliculas")
    Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
        return repositoryPelicula.save(pelicula);
    }

    @DeleteMapping("/peliculas/{id}")
    void eliminarPelicula(@PathVariable String id) {
        repositoryPelicula.deleteById(id);
    }
}
