package com.org.repositories;

import com.org.models.DetalleBoleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleBoletaRepository extends JpaRepository<DetalleBoleta,Integer> {
}
