package com.org.repositories;

import com.org.models.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorRepository extends JpaRepository<Proveedor,Integer> {
}
