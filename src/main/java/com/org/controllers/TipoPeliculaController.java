package com.org.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.models.TipoPelicula;
import com.org.repositories.ITipoPeliculaRepository;

@RestController
public class TipoPeliculaController {

	@Autowired ITipoPeliculaRepository repoTipoPelicula;
	
	@GetMapping("/tipoPelicula")
	List<TipoPelicula> listado(){
		return repoTipoPelicula.findAll();
	}
}
