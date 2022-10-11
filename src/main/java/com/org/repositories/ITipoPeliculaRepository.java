package com.org.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.models.TipoPelicula;

public interface ITipoPeliculaRepository extends JpaRepository<TipoPelicula, Integer>{

}
