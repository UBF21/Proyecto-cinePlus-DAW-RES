package com.org.repositories;

import com.org.models.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBoletaRepository extends JpaRepository<Boleta,String> {
}
