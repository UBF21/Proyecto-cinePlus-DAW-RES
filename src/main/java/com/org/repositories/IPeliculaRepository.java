package com.org.repositories;

import com.org.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepository extends JpaRepository<Pelicula,String> {
}
