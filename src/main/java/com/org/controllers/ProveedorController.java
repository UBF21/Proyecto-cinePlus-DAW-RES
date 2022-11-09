package com.org.controllers;

import com.org.models.Proveedor;
import com.org.repositories.IProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProveedorController {

    @Autowired
    IProveedorRepository repositoryProveedor;

    @GetMapping("/proveedores")
    List<Proveedor> listadoProveedores() {
        return repositoryProveedor.findAll();
    }

    @GetMapping("/proveedores/{id}")
    Proveedor obtenerProveedor(@PathVariable int id) {

        Optional<Proveedor> proveedor = repositoryProveedor.findById(id);
        if (proveedor.isPresent()) {
            return proveedor.orElse(new Proveedor());
        }

        return proveedor.get();
    }

    @PostMapping("/proveedores")
    Proveedor guardarProveedor(@RequestBody Proveedor proveedor) {

        return repositoryProveedor.save(proveedor);
    }

    @DeleteMapping("/proveedores/{id}")
    void eliminarProveedor(@PathVariable int id) {

        repositoryProveedor.deleteById(id);
    }
}
